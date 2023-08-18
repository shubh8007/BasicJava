package com.app.traingle;

import java.util.Scanner;

public class LeftAnglePattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i;
		int j;
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(i=0;i<n;i++) {
			for(j=2*(n-i);j>=0;j--) {
				System.out.print(" ");
					
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		

	}

}
