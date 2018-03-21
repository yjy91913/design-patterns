package com.ziroom.patterns.template.dao;

import com.ziroom.patterns.template.JdbcTemplate;
import com.ziroom.patterns.template.RowMapper;
import com.ziroom.patterns.template.entity.Member;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Yangjy on 2018/3/20.
 */
public class MemberDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);



    /*@Override
    public Object processResult(ResultSet rs, int rowNumber) throws Exception {
        Member member = new Member();
        member.setUsername(rs.getString("username"));
        member.setPassword(rs.getString("password"));
        member.setAge(rs.getInt("age"));
        member.setAdd(rs.getString("add"));
        return member;
    }*/

    public List<?> query() throws Exception {
        String sql = "SELECT *　FROM t_member";
        return jdbcTemplate.excuteQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAdd(rs.getString("add"));
                return member;
            }
        }, null);
    }
}
