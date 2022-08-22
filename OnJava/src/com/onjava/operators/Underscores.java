package com.onjava.operators;

/**
 * @Author: Sandwich
 * @Description: 下划线清晰表达数据
 * @Date: Created in 11:11 下午 2022/8/21
 */


public class Underscores {
    public static void main(String[] args) {
        double d = 341_435_936.445_667;
        System.out.println(d);
        int bin = 0b0010_1111_1010_1111_1010_1111_1010_1111;
        System.out.println(Integer.toBinaryString(bin));
        System.out.printf("%x%n", bin);
        long hex = 0x7f_e9_b7_aa;
        System.out.printf("%x%n", hex);
    }
}
