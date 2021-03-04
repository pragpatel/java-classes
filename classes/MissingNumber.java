package classes;

public class MissingNumber {

	public static void main(String[] args) {
		// Find the missing number in a[]

		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 1, 2, 3, 5 };

		int sumA = 0;
		int sumB = 0;

		for (int i = 0; i < a.length; i++) {
			sumA = sumA + a[i];
		}
		System.out.println("SumA = " + sumA);

		for (int i = 0; i < b.length; i++) {
			sumB = sumB + b[i];
		}
		System.out.println("SumB = " + sumB);

		System.out.println("So the missing number is : " + (sumA - sumB));

	}

}
