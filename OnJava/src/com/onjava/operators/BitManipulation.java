package com.onjava.operators;

import java.util.Random;

/**
 * @Author: Sandwich
 * @Description: 使用位运算符
 * @Date: Created in 10:58 上午 2022/8/22
 */


public class BitManipulation {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt();
        int j = rand.nextInt();
        printBinaryInt("-1", -1);
        printBinaryInt("+1", +1);
        int maxpos = 2147483647;
        printBinaryInt("maxpos", maxpos);
        int maxneg = -2147483648;
        printBinaryInt("maxneg", maxneg);
        printBinaryInt("i", i);
        printBinaryInt("~i", ~i);
    }

    static void printBinaryInt(String s, int i) {
        System.out.println(s + ", int: " + i + ", binary: \n" +
                Integer.toBinaryString(i));
    }

    static void printBinaryLong(String s, long l) {
        System.out.println(s + ", long: " + l + ", binary: \n" +
                Long.toBinaryString(l));
    }
}
