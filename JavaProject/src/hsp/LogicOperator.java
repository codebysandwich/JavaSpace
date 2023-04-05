/**
 * File              : LogicOperator.java
 * Author            : sandwich
 * Date              : 2022-10-14 20:02:58
 * Last Modified Date: 2022-10-30 21:17:43
 * Last Modified By  : sandwich
 */

package hsp;

class LogicOperator {
	public static void main(String[] args) {
		int age = 20;
		if (age >= 0 && age <= 90) {
			System.out.println("Okay");
		}

		// 逻辑运算符、位运算符号
		int res = age & 0;
		System.out.println(res);
		res = ~3;
		System.out.println(res);
	}
}
