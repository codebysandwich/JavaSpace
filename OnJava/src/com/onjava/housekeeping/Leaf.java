package com.onjava.housekeeping;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 1:04 上午 2022/9/7
 */


public class Leaf {
    int i = 0;
    Leaf increment() {
        i++;
        return this;
    }
    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
