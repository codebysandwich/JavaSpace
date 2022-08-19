package com.onjava.objects;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 10:43 上午 2022/8/19
 */


public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
