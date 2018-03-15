package com.ziroom.patterns.factory.func;

import com.ziroom.patterns.factory.Milk;
import com.ziroom.patterns.factory.Yili;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author Administrator
 * @version 1.0.0
 * @create 2018-03-15 10:00
 */
public class YiLiFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}