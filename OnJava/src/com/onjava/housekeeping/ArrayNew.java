package com.onjava.housekeeping;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author: Sandwich
 * @Description: 演示动态创建数组
 * @Date: Created in 6:49 下午 2022/9/12
 */


public class ArrayNew {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int[] a = new int[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
