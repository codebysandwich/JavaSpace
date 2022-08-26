package com.onjava.control;


/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 11:05 上午 2022/8/26
 */


public class WhileTest {
    static boolean condition(){
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while (condition()) {
            System.out.println("Inside 'while'");
        }
        System.out.println("Exited 'while'");
    }
}
