package com.onjava.operators;

/**
 * @Author: Sandwich
 * @Description: 三元运算符与if-else
 * @Date: Created in 4:15 下午 2022/8/23
 */


public class TernaryIfElse {

    static int ternary(int i) {
        return i < 10 ? i*100 : i * 10;
    }

    static int standardIfElse(int i) {
        if (i < 10) {
            return i * 100;
        }
        else {
            return i * 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfElse(9));
        System.out.println(standardIfElse(10));
    }
}
