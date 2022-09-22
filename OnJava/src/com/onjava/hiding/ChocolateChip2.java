package com.onjava.hiding;

import com.onjava.hiding.cookie2.Cookie;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 12:51 上午 2022/9/23
 */


public class ChocolateChip2 extends Cookie{
    public ChocolateChip2() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
        bite();
    }

    public static void main(String[] args) {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
}
