/**
 * File              : Constants.java
 * Author            : sandwich
 * Date              : 2022-11-25 16:10:24
 * Last Modified Date: 2023-04-05 18:35:43
 * Last Modified By  : sandwich
 */

package javacore.ch03;

/**
 * Constants
 */
public class Constants {

	public static void main(String[] args) {
		final double CM_PER_INCH = 2.54;
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters: "
				+ paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}
}
