package com.onjava.housekeeping;

/**
 * @Author: Sandwich
 * @Description: 简单演示数组的使用情况
 * @Date: Created in 6:39 下午 2022/9/12
 */


public class ArrayOfPrimitives {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;
        a2 = a1;
        for (int i = 0; i < a2.length; i++) {
            a2[i] += 1;
        }

        for (int i = 0; i < a1.length; i++) {
            System.out.println("a1[" + i + "] = " + a1[i]);
        }
    }
}
