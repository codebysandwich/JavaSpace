package com.onjava.housekeeping;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 11:45 下午 2022/9/3
 */

class Rock2 {
    Rock2(int i) {
        System.out.print("Rock " + i + " ");
    }
}

public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            new Rock2(i);
        }
    }
}
