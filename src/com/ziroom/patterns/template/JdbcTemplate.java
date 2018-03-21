package com.ziroom.patterns.template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author Yangjy
 * @version 1.0.0
 * @date 2018-03-20
 */
public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }

    private Connection getConnection() throws  Exception {
        return this.dataSource.getConnection();
    }

    private PreparedStatement createPreparedStatement(Connection connection,String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

    private ResultSet executeQuery(PreparedStatement preparedStatement,Object[] values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            preparedStatement.setObject(i,values[i]);
        }
        return preparedStatement.executeQuery();
    }

    public List<?> excuteQuery(String sql,Object [] values) throws SQLException {
        List<Object> result = null;
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            //获取连接
            //connection = dataSource.getConnection();
            conn = this.getConnection();
            //创建语句集
            preparedStatement = this.createPreparedStatement(conn,sql);
            //preparedStatement.set
            //执行语句集,获得结果集
            rs = this.executeQuery(preparedStatement,null);
            result = new ArrayList<>();
            //解析语句集
            int rowNumber =1;

            while (rs.next()){
                result.add(processResult(rs,rowNumber++));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭结果集
            rs.close();
            //关闭语句集
            preparedStatement.close();
            //关闭连接
            conn.close();
        }

        return result;
    }


    public abstract Object processResult(ResultSet rs,int rowNumber) throws SQLException, Exception;

}
