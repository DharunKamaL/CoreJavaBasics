package problems;

public class ReverseNumSample {

	
	static int rem;
	static int num;

	static void revNum(int n) {
		while (n != 0) {
			rem = n % 10;
			System.out.print(rem);
			n = n / 10;
		}
		
	}

	public static void main(String[] args) {
		revNum(12345);
	}
}
