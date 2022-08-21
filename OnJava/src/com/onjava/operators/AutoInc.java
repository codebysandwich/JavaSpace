package com.onjava.operators;

/**
 * @Author: Sandwich
 * @Description: 演示++ -- 运算符
 * @Date: Created in 4:38 下午 2022/8/19
 */


public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i: " + i);        //1
        System.out.println("++i: " + ++i);    //2
        System.out.println("i++" + i++);      //2
        System.out.println("i: " + i);        //3
        System.out.println("--i: " + --i);    //2
        System.out.println("i--: " + i--);    //2
        System.out.println("i: " + i);        //1
    }
}
