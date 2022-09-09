package com.onjava.housekeeping;

/**
 * @Author: Sandwich
 * @Description: 演示类里变量(字段、成员变量)初始化的规则
 * @Date: Created in 1:04 上午 2022/9/10
 */

class Window {
    Window(int maker) {
        System.out.println("Window(" + maker + ")");
    }
}

class House {
    Window w1 = new Window(1);

    House() {
        System.out.println("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3);
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f();
    }
}
