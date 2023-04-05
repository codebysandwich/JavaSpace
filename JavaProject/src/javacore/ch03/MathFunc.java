/**
 * File              : MathFunc.java
 * Author            : sandwich
 * Date              : 2022-11-26 13:56:42
 * Last Modified Date: 2022-11-26 14:03:14
 * Last Modified By  : sandwich
 */

package javacore.ch03;

import static java.lang.Math.*;

/**
 * MathFunc
 */
public class MathFunc {

	public static void main(String[] args) {
		double x = pow(2, 3);
		System.out.println(x);
		x = sqrt(4);
		System.out.println(x);
		// 对三角函数多少有点无能为力
		System.out.println(sin(PI / 6));
	}
}
