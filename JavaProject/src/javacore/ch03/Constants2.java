/**
 * File              : Constants2.java
 * Author            : sandwich
 * Date              : 2022-11-25 16:17:04
 * Last Modified Date: 2022-11-25 17:22:16
 * Last Modified By  : sandwich
 */

package javacore.ch03;

/**
 * Constants2
 */
public class Constants2 {

	public static final double CM_PER_INCH = 2.54;

	public static void main(String[] args) {
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters: "
				+ paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}
}
