package com.ziroom.patterns.proxy.stat;


/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author Yangjy
 * @version 1.0.0
 * @date 2018-03-15
 */
public class Father {

    private Son son;

    //静态代理缺点
    //只能给儿子找对象,不能帮女儿找
    public void findLove(){
        System.out.println("根据你的要求物色");
        this.son.findLove();
        System.out.println("双方父母是否同意");
    }

    //静态代理,有多少方法 就得做多少代理
    //在代理之前 所有东西都是已知的
    public void job() {
        System.out.println("根据你的要求物色");
        this.son.job();
        System.out.println("双方父母是否同意");
    }

    public void buy() {
        System.out.println("根据你的要求物色");
        this.son.buy();
        System.out.println("双方父母是否同意");
    }

}
