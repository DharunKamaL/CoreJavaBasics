package problems;

public class UpperCaseSample {

	static void toUpper(String letters) {
		StringBuilder a = new StringBuilder(letters);
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
				int c = (int) a.charAt(i) - 32;
				a.setCharAt(i, (char) c);
			}
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		toUpper("abc");
	}
}