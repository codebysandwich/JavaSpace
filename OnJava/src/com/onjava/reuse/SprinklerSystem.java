package com.onjava.reuse;

/**
 * @Author: Sandwich
 * @Description: 演示复用其他类
 * @Date: Created in 2:41 下午 2022/9/28
 */


class Watersource {
    private String s;
    Watersource() {
        System.out.println("Watersource()");
        s = "constructor";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private Watersource source = new Watersource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " f = " + f + " " +
                "source = " + source;

    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}
