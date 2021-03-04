package classes;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {

		String name[] = { "pari", "shreeya", "swastik", "suna", "munu", "suna", "shreeya" };
		// solution #1, using 2 for loop

		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].equalsIgnoreCase(name[j])) {
					System.out.println("The duplicate element is : " + name[i]);
				}
			}
		} // end of sol 1

		// Solution #2 ,Using HashSet as it doesn't allow the duplicate element

		Set<String> s = new HashSet<String>();
		for (String n : name) {
			if (s.add(n) == false) {
				System.out.println("The duplicate element is : " + n);
			}
		}

		// Solution #3 ,Using HashSet as it doesn't allow the duplicate element
		Set<String> s1 = new HashSet<String>();
		for (int i = 0; i < name.length; i++) {
			if (s1.add(name[i]) == false) {
				System.out.println("The duplicate element is : " + name[i]);
			}
		}

	}

}
