package com.onjava.housekeeping;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author: Sandwich
 * @Description: Integer对象数组
 * @Date: Created in 6:58 下午 2022/9/12
 */


public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        // 初始化，否则为[NULL, NULL, ……]
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(500);
        }

        System.out.println(Arrays.toString(a));
    }
}
