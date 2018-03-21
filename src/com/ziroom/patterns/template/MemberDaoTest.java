package com.ziroom.patterns.template;

import com.ziroom.patterns.template.dao.MemberDao;
import com.ziroom.patterns.template.entity.Member;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Yangjy on 2018/3/20.
 */
public class MemberDaoTest {

    public static void main(String[] args) throws Exception {
        MemberDao memberDao = new MemberDao();

        List<?> query = memberDao.query();




    }
}
