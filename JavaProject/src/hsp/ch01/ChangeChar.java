/**
 * File              : ChangeChar.java
 * Author            : sandwich
 * Date              : 2022-12-06 23:34:45
 * Last Modified Date: 2023-04-05 20:14:02
 * Last Modified By  : sandwich
 */

package hsp.ch01;

/**
 * ChangeChar
 */
public class ChangeChar {
	public static void main(String[] args) {
		String s = "sand\tleo\tmary";
		String s1 = "sandwich\rleo";
		System.out.println(s);
		System.out.println(s1);
		String s2 = "书名\t作者\t价格\t销量\n三国\t罗贯中" +
				"120\t1000";
		System.out.println(s2);
	}
}
