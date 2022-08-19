package com.onjava.operators;

/**
 * @Author: Sandwich
 * @Description: 演示赋值运算符
 * @Date: Created in 1:54 下午 2022/8/19
 */


class Tank {
    int level;
}

public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1: t1.level: " + t1.level +
                ", 2: t2.level: " + t2.level);
        /* 引用类型赋值
        这一步小心引用类型的赋值
        思考下t1.level = t2.level
        */
        t1 = t2;
        System.out.println("2: t1.level: " + t1.level +
                ", 2: t2.level: " + t2.level);
        t1.level = 27;
        System.out.println("3: t1.level: " + t1.level +
                ", 2: t2.level: " + t2.level);
    }
}
