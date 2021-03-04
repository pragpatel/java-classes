package classes;

public class LargestAndSmallest {

	public static void main(String[] args) {
		int number[] = { 10, 20, -30, 5000, -80, 100, -7000 };

		// find the Largest and smallest
		int largest = number[0];
		int smallest = number[0];

		for (int i = 1; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];
			} else {
				if (number[i] < smallest) {
					smallest = number[i];
				}
			}
		}
		System.out.println("Smallest number is :: " + smallest);
		System.out.println("largest number is :: " + largest);
	}
}
