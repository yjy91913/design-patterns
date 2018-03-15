package com.ziroom.patterns.factory.func;

import com.ziroom.patterns.factory.MengNiu;
import com.ziroom.patterns.factory.Milk;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author Administrator
 * @version 1.0.0
 * @create 2018-03-15 10:00
 */
public class MengLiuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new MengNiu();
    }
}