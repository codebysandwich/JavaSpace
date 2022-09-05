package com.onjava.housekeeping;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 11:08 下午 2022/9/3
 */

class Rock {
    // 简单的构造函数
    Rock() {
        System.out.print("Rock ");
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
