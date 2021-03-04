package classes;

public class PrimeNumberConcept {

	public static void main(String[] args) {
		// prime number = 13/13 or 13/1 or 17
		// 2 is lowest prime num , 3 is next prime num , 0 and 1 are not prime number

		int num = 11;
		System.out.println(num + " is a prime number , " + isPrimeNumber(num));// 11 is a prime number , true
//		isPrimeNumber(13);
		getPrimeNumbers(num); // All the prime number between 1 and 11 are : 2, 3, 5, 7, 9, 11,
	}

	public static boolean isPrimeNumber(int num) {

		if (num <= 1) {
			System.out.println(num + " is prime number, " + false);
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getPrimeNumbers(int num) {
		System.out.print(" All the prime number between 1 and " + num + " are : ");

		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + ", ");
			}
		}
	}
}
