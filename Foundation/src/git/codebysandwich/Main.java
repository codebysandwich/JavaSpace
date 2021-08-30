package git.codebysandwich;

public class Main {
    /**
     * 主程序入口
     * @param args 接受命令行参数
     */
    public static void main(String[] args) {
        //经典的hello world
        System.out.println("hello, world!");

        //region 字符串一些情况
        System.out.println(100 + 3 + "hello");
        System.out.println("hello" + 100 + 10);
        //endregion

        //region 字符细节
        // char 占2个字节
        char chr = 97; // unicode 编码对应的数值
        System.out.println(chr);
        char c2 = 'a';
        System.out.println((int) c2);
        char c3 = 960;
        System.out.println(c3);
        //endregion

        //region 自动类型转换的一些细节
        byte b = 10;    // 字面量推断，10满足byte的范围，可以自动转换, 区别与int i =10; byte b = i;这是无法隐式转换的
        char c1 = 'a';
        short s = 200;
        int n = b + c1 + s; // char, short, byte 计算时会自动提升至int类型
        System.out.println(n);
        //endregion
    }
}
