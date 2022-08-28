package com.onjava.control;

import java.util.Random;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 10:44 下午 2022/8/28
 */


public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.print((char) c + ", " + c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("Sometimes vowel");
                    break;
                default:
                    System.out.println("consonant");
            }
        }
    }
}
