/**
 * File              : ConvertDetial.java
 * Author            : sandwich
 * Date              : 2022-10-14 20:04:44
 * Last Modified Date: 2022-10-22 04:08:13
 * Last Modified By  : sandwich
 */

package hsp;

public class ConvertDetial {
	public static void main(String[] args) {
		byte b1 = 2;
		byte b2 = 3;
		// System.out.println(getType(b1 + b2)); // class java.lang.Integer

		/**
		 * byte char short 计算会转化为int类型
		 */
		char c = 'a';
		System.out.println(c + b1);
		System.out.println(getType(b2 + b1));
		double d;
		float f = 3.14F;
		d = f;
		/**
		 * 低精度自动转化到高精度存在问题-低精度无法准确表示的问题
		 */
		System.out.println(d);
		d = 3.14;
		System.out.println(d);
	}

	/**
	 * getType comment
	 * 获取对象的数据类型
	 * 
	 * @param o 待获取类型的对象
	 * @return 类型的字符串表达
	 */
	public static String getType(Object o) {
		return o.getClass().toString();
	}
}
