package com.onjava.housekeeping;

/**
 * @Author: Sandwich
 * @Description: 参数顺序不同也可以重载入
 * @Date: Created in 7:13 下午 2022/9/4
 */


public class OverloadingOrder {
    static void f(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        System.out.println("int: " + i + ", String: " + s);
    }

    public static void main(String[] args) {
        f("String first", 1);
        f(99, "Int first");
    }
}
