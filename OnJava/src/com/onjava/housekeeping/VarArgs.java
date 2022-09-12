package com.onjava.housekeeping;

/**
 * @Author: Sandwich
 * @Description: 数组作为可变参数列表
 * @Date: Created in 10:49 下午 2022/9/12
 */

class A {
}

public class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj :
                args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{47, (float) 3.14, 11.11});
        printArray(new Object[] {"one", "two", "three"});
        printArray(new Object[] {new A(), new A(), new A()});
    }
}
