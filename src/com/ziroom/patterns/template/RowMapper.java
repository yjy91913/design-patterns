package com.ziroom.patterns.template;

import java.sql.ResultSet;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author Yangjy
 * @version 1.0.0
 * @date 2018-03-21
 */
public interface RowMapper<T>{

    T mapRow(ResultSet rs,int rowNum) throws Exception;

}
