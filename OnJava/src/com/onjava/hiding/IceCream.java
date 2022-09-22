package com.onjava.hiding;


/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 5:59 下午 2022/9/22
 */

class Sundae {
    private Sundae() {}

    static Sundae makeSundae() {
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        // Sundae sundae = new Sundae(); - 受保护的构造函数
        Sundae sundae = Sundae.makeSundae();
    }
}
