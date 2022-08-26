package com.onjava.control;

/**
 * @Author: Sandwich
 * @Description: for循环给出char字符清单
 * @Date: Created in 11:13 上午 2022/8/26
 */


public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++) {
            if (Character.isLowerCase(c)) {
                System.out.println("Value: " + (int) c + " Character: " + c);
            }
        }
    }
}
