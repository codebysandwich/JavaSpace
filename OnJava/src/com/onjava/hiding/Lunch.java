package com.onjava.hiding;

/**
 * @Author: Sandwich
 * @Description: private构造器，外部获取实例的方式
 * @Date: Created in 1:06 下午 2022/9/28
 */


class Soup1 {
    private Soup1() {}

    // 通过静态函数放回实例实现
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {}

    private static Soup2 ps1 = new Soup2();

    //通过静态属性+静态函数实现
    public static Soup2 access() {
        return ps1;
    }

    public void f() {}
}

public class Lunch {
    void privateTest() {
        //构造函数为private外部无法实例化
        //Soup1 sup = new Soup1();
    }

    void staticTest() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}
