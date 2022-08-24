package com.onjava.operators;

/**
 * @Author: Sandwich
 * @Description: 小数转整数时的截断
 * 小数显示转整数(强转)将直接截断小数部分
 * @Date: Created in 10:54 下午 2022/8/24
 */


public class CastingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("(int) above: " + (int) above);
        System.out.println("(int) below: " + (int) below);
        System.out.println("(int) fabove: " + (int) fabove);
        System.out.println("(int) fbelow: " + (int) fbelow);
    }
}
