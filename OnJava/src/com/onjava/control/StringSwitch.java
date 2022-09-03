package com.onjava.control;

/**
 * @Author: Sandwich
 * @Description: Java7中新增String Switch
 * @Date: Created in 11:38 下午 2022/8/28
 */


public class StringSwitch {
    public static void main(String[] args) {
        String color = "red";
        // 老方法if-else
        if ("red".equals(color)) {
            System.out.println("RED");
        } else if ("green".equals(color)) {
            System.out.println("GREEN");
        } else if ("blue".equals(color)) {
            System.out.println("BLUE");
        } else if ("yellow".equals(color)) {
            System.out.println("YELLOW");
        } else {
            System.out.println("Unknown");
        }
        // 新方法使用switch
        switch (color) {
            case "red":
                System.out.println("RED");
                break;
            case "green":
                System.out.println("GREEN");
                break;
            case "blue":
                System.out.println("BLUE");
                break;
            case "yellow":
                System.out.println("YELLOW");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }
}
