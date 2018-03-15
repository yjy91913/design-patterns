package com.ziroom.patterns.factory.abstr;

import com.ziroom.patterns.factory.Milk;
import com.ziroom.patterns.factory.func.MengLiuFactory;
import com.ziroom.patterns.factory.func.TeLunSuFactory;
import com.ziroom.patterns.factory.func.YiLiFactory;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author Administrator
 * @version 1.0.0
 * @create 2018-03-15 10:27
 */
public class MilkFactory extends AbstractFactory {
    @Override
    public Milk getMengNiu() {
        return new MengLiuFactory().getMilk();
    }

    @Override
    public Milk getYiLi() {
        return new YiLiFactory().getMilk();
    }

    @Override
    public Milk getTeLunSu() {
        return new TeLunSuFactory().getMilk();
    }
}
