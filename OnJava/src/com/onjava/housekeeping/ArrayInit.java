package com.onjava.housekeeping;

import java.util.Arrays;

/**
 * @Author: Sandwich
 * @Description: 初始化数组的两种方式
 * @Date: Created in 10:37 下午 2022/9/12
 */


public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {
                1, 2,
                3, // 自动装箱
        };
        Integer[] b = new Integer[] {
                1, 2,
                3,
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
