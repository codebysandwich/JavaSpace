package com.onjava.operators;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 5:18 下午 2022/8/25
 */


public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println(big + 1);
        System.out.println(big * 4);
        System.out.println(Integer.toBinaryString(big));
        System.out.println(Integer.toBinaryString(big + 1));
    }
}
