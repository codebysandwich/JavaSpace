package com.onjava.housekeeping;

import jdk.nashorn.internal.runtime.Context;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 10:12 上午 2022/9/12
 */

class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
}

public class Mugs {
    Mug mug1;
    Mug mug2;

    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }

    Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int i) {
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        new Mugs();
        System.out.println("New Mugs completed");
        new Mugs(1);
        System.out.println("New Mugs(1) completed");
    }
}
