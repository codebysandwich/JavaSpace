package com.source.utils;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 10:26 下午 2022/8/26
 */


public class Range {
    public static int[] range(int start, int end, int step) {
        if (step == 0) {
            throw new IllegalArgumentException("zero not expected!");
        }
        int SZ = Math.max(0, step > 0 ? (end - start - 1) / step + 1 :
                (end - start + 1) / step + 1);
        int[] result = new int[SZ];
        for (int i = 0; i < SZ; i++) {
            result[i] = start + i * step;
        }
        return result;
    }

    public static int[] range(int start, int end) {
        return range(start, end, 1);
    }

    public static int[] range(int end) {
        return range(0, end);
    }

    public static void main(String[] args) {
        for (int i : range(10, 4, -2)) {
            System.out.println(i);
        }

        for (int i : range(10)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
