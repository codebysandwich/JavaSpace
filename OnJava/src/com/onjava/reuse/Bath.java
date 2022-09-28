package com.onjava.reuse;

/**
 * @Author: Sandwich
 * @Description: 引用类型的4种初始化
 * @Date: Created in 12:51 上午 2022/9/29
 */

class Soap {
    private String s;
    Soap() {
        System.out.println("Soap()");
        s = "constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class Bath {
    // [1] 定义时初始化，优先级最高
    private String s1 = "Happy", s2 = "Happy",
                   s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath() {
        System.out.println("Inside Bath()");
        // [2] 构造器中初始化，优先级第三
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }

    // [4] 实例初始化，在构造函数初始化之前，优先级第二
    {i = 47;}

    @Override
    public String toString() {
        if (s4 == null) {
            // [3] 延迟初始化，优先级最低
            s4 = "Joy";
        }
        return "s1 = "  + s1 +  "\n"  +
                "s2 = "  + s2 +  "\n"  +
                "s3 = "  + s3 +  "\n"  +
                "s4 = "  + s4 +  "\n"  +
                "i = "  + i +  "\n"  +
                "toy = "  + toy +  "\n"  +
                "castille = "  + castille;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}
