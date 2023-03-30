package problems;

public class NosUsingRecursion {
	
	static void rec(int n) {
		if(n<=10) {
			System.out.println(n);
			rec(n+1);
		}
	}
	
	public static void main(String[] args) {
		rec(1);
	}
}