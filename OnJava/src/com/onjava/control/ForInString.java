package com.onjava.control;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 11:33 上午 2022/8/26
 */


public class ForInString {
    public static void main(String[] args) {
        for (char c : "An African Swallow".toCharArray()) {
            System.out.print(c + " ");
        }
    }
}
