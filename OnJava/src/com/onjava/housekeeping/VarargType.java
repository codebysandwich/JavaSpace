package com.onjava.housekeeping;

/**
 * @Author: Sandwich
 * @Description: 不同数据类型的可变参数列表
 * 同时说明可变参数列表不完全依赖自动装箱，但是也可以与自动装箱和谐共处（Character 'a'）
 * @Date: Created in 9:38 下午 2022/9/14
 */


public class VarargType {
    static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
    }
}
