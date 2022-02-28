/*
 * @Author: sandwich
 * @Date: 2022-01-18 14:19:29
 * @LastEditTime: 2022-02-03 11:33:16
 * @LastEditors: sandwich
 * @Description: In User Settings Edit
 * @FilePath: /HSP_Code/LogicOperator.java
 */

class LogicOperator {
    /**
     * 程序主函数
     * 
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        int age = 20;
        if (age >= 0 && age <= 90) {
            System.out.println("Okay");
        }
        if (age >= 0 & age <= 90) {
            System.out.println("okay");
        }
        // 逻辑运算符、位运算符号
        int res = age & 0;
        System.out.println(res);
        res = ~3;
        System.out.println(res);
    }
}