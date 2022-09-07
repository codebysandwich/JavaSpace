package com.onjava.housekeeping;

/**
 * @Author: Sandwich
 * @Description: 构造器中通过this调用构造器，提高代码复用率
 * @Date: Created in 11:38 下午 2022/9/7
 */


public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount = " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor w/ string arg only, s = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        System.out.println("string & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("no arg constructor");
    }

    void printPetalCount() {
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
