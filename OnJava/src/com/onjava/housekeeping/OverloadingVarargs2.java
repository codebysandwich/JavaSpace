package com.onjava.housekeeping;

/**
 * @Author: Sandwich
 * @Description: Character 变量自动抬升到float类型
 * @Date: Created in 9:15 下午 2022/9/15
 */


public class OverloadingVarargs2 {
    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
//        f('a', 'b');
    }
}
