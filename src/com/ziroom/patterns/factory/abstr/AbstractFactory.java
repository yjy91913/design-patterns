package com.ziroom.patterns.factory.abstr;

import com.ziroom.patterns.factory.Milk;

/**
 * 描述:
 * 抽象工厂 用户的主入口
 * 在spring中用的最广泛
 *
 * @author Administrator
 * @version 1.0.0
 * @create 2018-03-15 10:03
 */
public abstract class AbstractFactory {

    /**
     *
     * @return
     * 增加功能不改变原有代码
     */
    public abstract Milk getMengNiu();
    public abstract Milk getYiLi();
    public abstract Milk getTeLunSu();

}
