package com.onjava.operators;

/**
 * @Author: Sandwich
 * @Description: 科学计数法，指数计数法
 * @Date: Created in 9:33 上午 2022/8/22
 */


public class Exponents {
    public static void main(String[] args) {
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43F;
        System.out.println(expFloat);
        double expDouble = 47e47d;
        expDouble = 47e47;  // 自动转化为double类型
        System.out.println(expDouble);
    }
}
