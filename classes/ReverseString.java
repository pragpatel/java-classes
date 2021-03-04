package classes;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		//below is to read from user's input
		
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Enter a string: "); String s = input.nextLine();
		 */
		 

		// 1st way
		String s = "Hello";
		int len = s.length();

		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse String = " + rev);// olleH

		// 2nd way
		StringBuffer s1 = new StringBuffer("HELLO");
		System.out.println("Reverse string is :" + s1.reverse()); // OLLEH

	}
}
