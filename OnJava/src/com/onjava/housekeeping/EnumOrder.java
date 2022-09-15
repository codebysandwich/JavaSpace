package com.onjava.housekeeping;

/**
 * @Author: Sandwich
 * @Description: Enum常量的声明序列
 * @Date: Created in 10:27 下午 2022/9/15
 */


public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s :
                Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}
