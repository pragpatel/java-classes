package classes;

public class RemoveJunkCharacterClass {

	public static void main(String[] args) {

		// Remove the junk character from the below sting
		String s = "@@@###$$% JAVA ^^&&*** Class )_)_)_ Practice";

		String s1 = "@@@###$$% 1234 ^^&&*** Class )_)_)_ Practice";

		// regular expression [^a-zA-Z0-9] means remove everything except a-z, A-Z and 0
		// -0 , we need to put ^ and
		// replace with nothing

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s); // JAVAClassPractice

		s1 = s1.replaceAll("[^0-9]", "");// from S1 remove everything except numbers between 0-9
		System.out.println(s1); // 1234

	}

}
