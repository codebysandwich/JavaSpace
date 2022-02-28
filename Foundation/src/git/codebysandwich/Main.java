package git.codebysandwich;

/**
 * @Author sandwich
 * @Date 2021
 */


public class Main {
    /**
     * 主程序入口
     *
     * @param args 接受命令行参数
     */
    public static void main(String[] args) {
        //经典的hello world
        System.out.println("hello, world!");

        //<editor-fold desc="字符串细节">
        System.out.println(100 + 3 + "hello");
        System.out.println("hello" + 100 + 10);
        //</editor-fold>

        //<editor-fold desc="char类型介绍">
        //char占两个字节
        char chr = 97; //unicode 编码对应的数值
        System.out.println(chr);
        char c2 = 'a';
        System.out.println((int) c2);
        char c3 = 960;
        System.out.println(c3);
        //char c4 = '\u03C0';
        char c4 = '\u270C';
        System.out.println(c4);
        //codepoint对字符串的影响(𝕆由两个char组成)
        String l = "\uD835\uDD46 is the set of octonins";
        System.out.println(l + "的第二个字符是：" + l.charAt(1));
        System.out.println("字符串长度为:" + l.length());
        System.out.println("字符串码点计数为:" + l.codePointCount(0, l.length()));
        //</editor-fold>

        //<editor-fold desc="byte char short 计算问题">
        byte b = 10;    // 字面量推断，10满足byte的范围，可以自动转换, 区别与int i =10; byte b = i;这是无法隐式转换的
        char c1 = 'a';
        short s = 200;
        int n = b + c1 + s; // char, short, byte 计算时会自动提升至int类型
        System.out.println(n);
        //</editor-fold>

        //<editor-fold desc="计算提升数值类型">
        short s1 = 12;
        short s2 = 9;
        s1 = (short) (s1 - s2);
        System.out.printf("short:%d变量计算自动抬升数据类型%n", s1);

        char c = 'a';
        System.out.println(c);
        //</editor-fold>

        //<editor-fold desc="测试">
        int a = 99;
        System.out.println(a);
        //</editor-fold>

        //region sand
        int tt = -99;
        System.out.println(tt);
        //endregion


        //<editor-fold desc="一些细节">
        int x = 9;
        int y = 2;
        double z = 1.0 * x / y;
        System.out.println(z);
        //</editor-fold>

        //<editor-fold desc="运算符">
        int i = 1;
        i = i++;
        // temp = i， i += 1； i = temp
        System.out.println(i);
        i = 1;
        i = ++i;
        // i += 1, temp = i; i = temp
        System.out.println(i);

        System.out.println(-5 % 2);
        //</editor-fold>
    }
}