package com.onjava.operators;

import java.util.Random;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 4:11 下午 2022/8/19
 */


public class MathOps {
    public static void main(String[] args) {
        // Create a seeded random number generator
        Random rand = new Random(47);
        int i, j, k;
        // Choose value from 1 to 100
        j = rand.nextInt(100) + 1;
        System.out.println("j: " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k: " + k);
        i = j + k;
        System.out.println("j + k: " + i);
        i = j - k;
        System.out.println("j - k: " + i);
        i = k / j;
        System.out.println("k / j: " + i);
        i = k * j;
        System.out.println("k * j" + i);
        i = k % j;
        System.out.println("k % j: " + i);
        // float calculation
        float u, v, w;
        v = rand.nextFloat();
        System.out.println("v: " + v);
        w = rand.nextFloat();
        System.out.println("w: " + w);
        u = v + w;
        System.out.println("v + w: " + u);
        u = v - w;
        System.out.println("v - w: " + u);
        u = v * w;
        System.out.println("v * w: " + u);
        u = v / w;
        System.out.println("v / w: " + u);
        // The same to char, byte, short, int, long and double
        u += v;
        System.out.println("u += v: " + u);
        u -= v;
        System.out.println("u -= v: " + u);
        u *= v;
        System.out.println("u *= v" + u);
        u /= v;
        System.out.println("u /= v: " + u);
    }
}
