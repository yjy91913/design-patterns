package com.ziroom.patterns.factory.sample;

import com.ziroom.patterns.factory.MengNiu;
import com.ziroom.patterns.factory.Milk;
import com.ziroom.patterns.factory.TeLunSu;
import com.ziroom.patterns.factory.Yili;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author Administrator
 * @version 1.0.0
 * @create 2018-03-14 16:57
 */
public class SampleFactory {
    public Milk getMilk(String name){
        switch (name) {
            case "特仑苏":return new TeLunSu();
            case "蒙牛":return new MengNiu();
            case "伊利":return new Yili();
            default:return null;
        }
    }
}
