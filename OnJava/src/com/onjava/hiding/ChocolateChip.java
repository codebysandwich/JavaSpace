package com.onjava.hiding;

import com.onjava.hiding.dessert.Cookie;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 11:27 下午 2022/9/22
 */


public class ChocolateChip extends Cookie{
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
        // bite()
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
