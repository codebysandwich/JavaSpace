package com.onjava.housekeeping;

/**
 * @Author: Sandwich
 * @Description: 数组作为参数传递给其他方法
 * @Date: Created in 10:42 下午 2022/9/12
 */


public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[] {"fiddle", "de", "dum"});
    }
}

class Other {
    public static void main(String[] args) {
        for (String s :
                args) {
            System.out.print(s + " ");
        }
    }
}