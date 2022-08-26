package com.onjava.control;

import java.util.Random;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 11:25 上午 2022/8/26
 */


public class ForInFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float[] f = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = rand.nextFloat();
        }
        for (float x : f) {
            System.out.println(x);
        }
    }
}
