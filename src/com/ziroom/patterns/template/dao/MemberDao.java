package com.ziroom.patterns.template.dao;

import com.ziroom.patterns.template.JdbcTemplate;
import com.ziroom.patterns.template.entity.Member;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Yangjy on 2018/3/20.
 */
public class MemberDao extends JdbcTemplate {

    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public Object processResult(ResultSet rs, int rowNumber) throws Exception {
        Member member = new Member();
        member.setUsername(rs.getString("username"));
        member.setPassword(rs.getString("password"));
        member.setAge(rs.getInt("age"));
        member.setAdd(rs.getString("add"));
        return member;
    }

    public List<Object> query() throws SQLException {
        String sql = "SELECT *　FROM t_member";
        super.excuteQuery(sql ,null);
    }
}
