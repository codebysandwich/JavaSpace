package com.onjava.operators;

/**
 * @Author: Sandwich
 * @Description: Math 进行四舍五入
 * @Date: Created in 11:01 下午 2022/8/24
 */


public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        // Math 属于 java.lang 包，不需要额外import
        System.out.println("Math.round(above): " + Math.round(above));
        System.out.println("Math.round(below): " + Math.round(below));
        System.out.println("Math.round(fabove): " + Math.round(fabove));
        System.out.println("Math.round(fbelow): " + Math.round(fbelow));
    }
}
