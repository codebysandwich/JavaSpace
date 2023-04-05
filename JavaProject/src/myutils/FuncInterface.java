/**
 * File              : FuncInterface.java
 * Author            : sandwich
 * Date              : 2022-12-01 12:44:28
 * Last Modified Date: 2022-12-01 13:03:16
 * Last Modified By  : sandwich
 */

package myutils;

/**
 * FuncInterface
 */
public class FuncInterface {
	static ThrowExceptionFunction isTrue(boolean b) {
		return (message) -> {
			if (b) {
				throw new RuntimeException(message);
			} else {
				System.out.println("test passed!");
			}
		};
	}

	public static void main(String[] args) {
		isTrue(false).sendMessage("运行抛出异常!");
		isTrue(true).sendMessage("运行抛出异常!");
	}
}
