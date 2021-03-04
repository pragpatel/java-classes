package classes;

public class ReverseInteger {

	public static void main(String[] args) {
		// 1st way of reversing the integer value
		int num = 12345;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev); // 54321

		System.out.println("----------");

		// 2nd way of reversing the integer value

		int num1 = 12345;

		StringBuffer s1 = new StringBuffer(String.valueOf(num1)).reverse();
		System.out.println(s1); // 54321
	}

}
