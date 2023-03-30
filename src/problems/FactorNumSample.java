package problems;

public class FactorNumSample {

	static void fact(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Factors: ");
		fact(12);
	}
}