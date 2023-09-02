package Numbers;

import java.util.Scanner;

public class ArmStrongNumberForAnyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int count = 0;
		int temp1 = n;
		while (temp1 != 0) {
			count ++;
			temp1 = temp1 / 10;

		}
		int temp2 = n;
		int sum = 0;
		while (temp2 != 0) {
			int rem = temp2 % 10;
			int mul = 1;
			for (int i = 0; i < count; i++) {
				mul = mul * rem;

			}
			sum = sum + mul;
			temp2 = temp2 / 10;
		}
		if (n == sum) {
			System.out.println("Number is Armstrong number");
		} else {
			System.out.println("Number is not ArmStrong Number..");
		}

	}

}
