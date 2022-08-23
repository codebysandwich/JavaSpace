package com.onjava.operators;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 4:11 下午 2022/8/23
 */


public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long) i;
        lng = i;
        long lng2 = (long) 200;
        lng2 = 200;
        i = (int) lng2;
        System.out.printf("i:%d, lng: %d, lng2:%d%n", i, lng, lng2);
    }
}
