package com.onjava.operators;

import java.util.Random;

/**
 * @Author: Sandwich
 * @Description: 关系运算符和逻辑运算符
 * @Date: Created in 4:20 下午 2022/8/21
 */


public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i >= j is " + (i >= j));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("i == j is" + (i == j));
        System.out.println("i != j is" + (i != j));

        // 逻辑运算符只能操作Boolean值
        System.out.println("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
        System.out.println("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
    }
}
