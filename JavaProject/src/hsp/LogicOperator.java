/**
 * File              : LogicOperator.java
 * Author            : sandwich
 * Date              : 2022-10-14 20:02:58
 * Last Modified Date: 2022-10-15 21:40:45
 * Last Modified By  : sandwich
 */

package hsp;

class LogicOperator {
	/**
	* 
	* @param args
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
