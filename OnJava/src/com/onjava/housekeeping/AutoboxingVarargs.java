package com.onjava.housekeeping;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 10:10 下午 2022/9/14
 */


public class AutoboxingVarargs {
    public static void f(Integer... args) {
        for (Integer i :
                args) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, 2);
        f(4, 5, 6, 7, 8, 9);
        f(10, 11, 12);
        // unnecessary
        //f(new Integer(-99), new Integer(0));
    }
}
