package com.onjava.housekeeping;

/**
 * @Author: Sandwich
 * @Description: 可变参数列表对函数重载带来的困扰
 * @Date: Created in 11:15 下午 2022/9/14
 */


public class OverloadingVarargs {
    static void f(Character... args) {
        System.out.print("first");
        for (Character c :
                args) {
            System.out.print(" " + c);
        }
        System.out.println();
    }

    static void f(Integer... args) {
        System.out.print("second");
        for (Integer i :
                args) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    static void  f(Long... args) {
        System.out.println("third");
    }

    public static void main(String[] args) {
        f('a', 'b', 'c');
        f(1);
        f(2, 1);
        f(0);
        f(1L);
        // - ambiguous f();
    }
}
