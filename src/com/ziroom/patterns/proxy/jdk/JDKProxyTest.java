package com.ziroom.patterns.proxy.jdk;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author Yangjy
 * @version 1.0.0
 * @date 2018-03-15
 */
public class JDKProxyTest {

    public static void main(String[] args) {

        Person person = (Person) new JDKMeiPo().getInstance(new Man());
        person.findLove();
    }

}
