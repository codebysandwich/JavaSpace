package com.onjava.operators;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 3:44 下午 2022/8/24
 */


public class Trap {
    public static void main(String[] args) {
        boolean b1 = false, b2 = true;
        // 计算时传递将b2的值用来判断了，程序出现错误1
        if (b1 = b2) {
            System.out.println("ohho");
        }
    }
}
