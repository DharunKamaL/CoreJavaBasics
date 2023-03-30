package problems;

import java.util.Scanner;

public class ArmstrongSample {

	static int digit1;
	static int quo;
	static int digit2;
	static int digit3;

	static void armstr(int n) {
		digit1 = n % 10;// 3
		quo = n / 10;// 15

		digit2 = quo % 10;// 5
		digit3 = quo / 10;// 1

		int armNum = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2) + (digit3 * digit3 * digit3);
		if (armNum == n) {
			System.out.println("isArm");
		} else
			System.out.println("notArm");

	}

	public static void main(String[] args) {
		
		System.out.println("Enter: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		armstr(num);
		input.close();
		
	}

}
