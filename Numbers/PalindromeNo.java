package Numbers;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while(num>0) {
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;	
		}
		if(temp==sum) {
			System.out.println("Number is palindrome:"+sum);
		}
		else {
			System.out.println("Number is not palindrome Number");
		}
		

	}

}
