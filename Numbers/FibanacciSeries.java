package Numbers;

import java.util.Scanner;

public class FibanacciSeries {

	public static void main(String[] args) {
		// Fibanacci series means Addition of previuos two Number
		//for ex. 0,1,1,2,3,5,8,13
Scanner sc=new Scanner(System.in);
		int n1=0;
		int n2=1;
		int n3;
		System.out.println("Enter Count to print upto...");
		int count=sc.nextInt();
		for(int i=0;i<count;i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		
	}

}
