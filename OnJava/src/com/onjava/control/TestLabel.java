package com.onjava.control;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 11:21 下午 2022/8/28
 */


public class TestLabel {
    public static void main(String[] args) {
        int k = 0;
        outer:
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            for (; k < 5; k++) {
                System.out.println(k);
                if (k == 3) {
                    continue outer;
                }
            }
        }
    }
}
