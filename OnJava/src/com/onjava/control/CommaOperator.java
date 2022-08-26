package com.onjava.control;

/**
 * @Author: Sandwich
 * @Description: for loop中使用逗号分隔符
 * @Date: Created in 11:21 上午 2022/8/26
 */


public class CommaOperator {
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2 ) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
