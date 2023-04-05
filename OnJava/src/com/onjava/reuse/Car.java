package com.onjava.reuse;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 3:04 下午 2022/11/17
 */


class Engine {
    public void start() {}
    public void rec() {}
    public void stop() {}
}

class Wheel {
    public void inflate(int psi) {}
}

class Window {
    public void rollup() {}
    public void rolldown() {}
}

class Door {
    public Window window = new Window();
    public void open() {}
    public void close() {}
}

public class Car {
    private Engine engine = new Engine();
    private Wheel[] wheels = new Wheel[4];
    private Door left = new Door(), right = new Door();

    public Car() {
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheels[0].inflate(72);
    }
}
