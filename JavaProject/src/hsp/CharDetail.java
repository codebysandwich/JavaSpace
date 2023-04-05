/**
 * File              : CharDetail.java
 * Author            : sandwich
 * Date              : 2022-10-13 16:48:03
 * Last Modified Date: 2023-04-05 20:12:29
 * Last Modified By  : sandwich
 */

package hsp;

class CharDetail {
	public static void main(String[] args) {
		char c1 = 'a';
		for (int i = 0; i < 26; i++) {
			System.out.println((char) (c1 + i));
		}
	}
}
