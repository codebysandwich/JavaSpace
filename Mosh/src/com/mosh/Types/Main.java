package com.mosh.Types;


import java.awt.*;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author: Sandwich
 * @Description: Mosh讲解数据类型变量等内容的代码示例
 * @Date: Created in 3:22 下午 2022/8/11
 */


public class Main {
    /**
     * 程序入口
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        byte myAge = 30;
        int herAge = myAge + 3;
        // 辅助长数值阅读
        int viewCounts = 123_456_789;
        // 数值默认为int，long必须显示定义
        long maxViewCounts = 3_123_456_789L;
        // 同样小数会被默认为double类型,声明时需要显示制定float类型
        float price = 10.99F;
        char chr = 'A';
        // format 输出
        System.out.printf("age: %d; viewCounts: %,d\n", herAge, viewCounts);
        System.out.printf("maxCount: %,d; price is %.2f\n", maxViewCounts, price);
        // chr 本质上还是数值型，支持加减法
        System.out.printf("char %c\n", chr + 1);
        //-------------------------------------------------------------//
        showPrimitiveAndReference();
        showStringDetail();
        showArray();
    }

    /**
     * 演示值类型与引用类型的区别
     */
    public static void showPrimitiveAndReference() {
        byte x, y = 1;
        x = 2;
        System.out.printf("x: %d, y: %d\n", x, y);
        Point point1 = new Point(1, 1);
        Point point2;
        point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        Date now = new Date();
        System.out.println(now.getTime());
    }

    /**
     * 演示字符串相关细节
     */
    public static void showStringDetail() {
        String message = "hello world" + " !!";
        System.out.println(message.endsWith("!!"));
        // 字符串不可修改的特性
        System.out.println(message.replace('!', '*'));
        System.out.println(message);
        System.out.println(message.toUpperCase());
        System.out.println(message);
        System.out.println(message.indexOf('l'));
        // index 不存在的数据返回-1
        System.out.println(message.indexOf('~'));
    }

    /**
     * 演示Array相关细节
     */
    public static void showArray() {
        /*
        int[] numbers = new int[5];
        numbers[0] = 3;
        */
        int[] numbers = {3, 2, 5, 1, 9};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

//        int[][] MultiNumbers = {{3, 2, 1}, {2, 3}};
        int[][] MultiNumbers = new int[2][3];
        for (int[] multiNumber : MultiNumbers) {
            System.out.println(Arrays.toString(multiNumber));
        }

    }
}
