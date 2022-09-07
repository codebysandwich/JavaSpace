package com.onjava.housekeeping;

/**
 * @Author: Sandwich
 * @Description: this 关键字在向其他方法传递当前对象时也很有用
 * @Date: Created in 11:19 下午 2022/9/7
 */

class Person {
    public void eat(Apple apple) {
        Apple peeledApple = apple.getPeeled();
        System.out.println(peeledApple.peeled);
        System.out.println("Yummy");
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        // do something
        apple.peeled = true;
        return apple;
    }
}

class Apple {
    boolean peeled = false;
    Apple getPeeled() {
        // 核心展示的是在这里
        return Peeler.peel(this);
    }
}

public class PassingThis {
    public static void main(String[] args) {
        Person person = new Person();
        Apple apple = new Apple();
        person.eat(apple);
    }
}
