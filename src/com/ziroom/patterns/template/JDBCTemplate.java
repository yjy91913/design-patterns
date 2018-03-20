package com.ziroom.patterns.template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public abstract class JDBCTemplate {

    private DataSource dataSource;

    public JDBCTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<?> excuteQuery(String sql,Object [] values){

        try {
            //获取连接
            Connection connection = dataSource.getConnection();
            //创建语句集
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //preparedStatement.set
            //执行语句集,获得结果集
            ResultSet rs = preparedStatement.executeQuery();
            List<Object> result = new ArrayList<>();
            //解析语句集
            while (rs.next()){
                result.add(processResult(rs));
            }
            //关闭结果集
            rs.close();
            //关闭语句集
            preparedStatement.close();
            //关闭连接
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    public abstract Object processResult(ResultSet rs);

}
