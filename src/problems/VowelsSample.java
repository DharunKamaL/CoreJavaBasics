package problems;

public class VowelsSample {

	static boolean isCont = false;
	static int count = 0;
	static String a;
	static String lowerCase;

	static void vowels(String word) {

		lowerCase = word.toLowerCase();

		for (int i = 0; i < word.length(); i++) {

			if (lowerCase.charAt(i) == 'a') {
				isCont = true;
				a = lowerCase.replaceAll("a", "");
				if (isCont) {
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println(a);
	}

	public static void main(String[] args) {
		vowels("Anagram");
	}
}