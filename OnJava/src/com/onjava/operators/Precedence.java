package com.onjava.operators;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 11:10 上午 2022/8/19
 */


public class Precedence {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        int a = x + y - 2 / 2 + z;
        int b = x + (y - 2) / (2 + z);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}