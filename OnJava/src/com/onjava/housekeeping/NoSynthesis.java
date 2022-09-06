package com.onjava.housekeeping;

/**
 * @Author: Sandwich
 * @Description: 显示创建构造器后默认的构造器无法使用
 * @Date: Created in 10:39 下午 2022/9/5
 */

class Brid2 {
    Brid2(int i) {}
    Brid2(double d) {}
}

public class NoSynthesis {
    public static void main(String[] args) {
        // Brid2 b = new Brid2();   No default
        Brid2 b2 = new Brid2(1);
        Brid2 b3 = new Brid2(1.0);
    }
}
