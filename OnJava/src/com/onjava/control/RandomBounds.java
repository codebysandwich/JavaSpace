package com.onjava.control;

import com.onjava.onjava.TimedAbort;

/**
 * @Author: Sandwich
 * @Description: Math.random 会产生0和1么？
 * @Date: Created in 9:04 下午 2022/8/31
 */


public class RandomBounds {
    public static void main(String[] args) {
        new TimedAbort(3);
        switch (args[0].length() == 0 ? "" : args[0]) {
            case "lower":
                while (Math.random() != 0.0) ;
                System.out.println("Produced 0.0!");
                break;
            case "upper":
                while (Math.random() != 1.0) ;
                System.out.println("Produced 1.0!");
                break;
            default:
                System.out.println("Usage:");
                System.out.println("\tRandomBounds lower");
                System.out.println("\tRandomBounds upper");
                System.exit(1);
                break;
        }
    }
}
