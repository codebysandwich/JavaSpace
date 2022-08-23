package com.onjava.operators;

/**
 * @Author: Sandwich
 * @Description: 字符串运算符 +
 * @Date: Created in 4:20 下午 2022/8/23
 */


public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);
        // 将x转化为String
        System.out.println(x + " " + s);
        s += "(summed) = ";
        // 级联操作
        System.out.println(s + (x + y + z));
        // Integer.toString简写
        System.out.println("" + x);
    }
}
