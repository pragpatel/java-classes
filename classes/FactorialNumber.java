package classes;

public class FactorialNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Factorials of 4 = 4*3*2*1
		// factrial of 1 = 1
		// Factorial of 0 = 1

		System.out.println("Factorial is : " + factorial(3));
		System.out.println("Factorial is : " + factorial(4));
		System.out.println("Factorial is : " + factorial(1));
		System.out.println("Factorial is : " + factorial(0));
		System.out.println("---------------");

		System.out.println("Factorial is : " + recursiveFact(3));
		System.out.println("Factorial is : " + recursiveFact(4));
		System.out.println("Factorial is : " + recursiveFact(1));
		System.out.println("Factorial is : " + recursiveFact(0));
	}

	// 1st way of solution that is non-recursive way
	public static int factorial(int num) {
		if (num == 0)
			return 1;

		int fact = 1;
//		  for (int i = 1; i <= num; i++)
//		  { fact = fact * i; }

		for (int i = num; i > 0; i--) {
			fact = fact * i;
		}
		return fact;
	}

	// 2nd way of solution that is recursive way
	public static int recursiveFact(int num) {
		if (num == 0) {
			return 1;
		} else {
			return (num * recursiveFact(num - 1));
		}
	}

}
