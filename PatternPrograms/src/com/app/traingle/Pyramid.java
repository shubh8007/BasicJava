package com.app.traingle;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int i,j;
		System.out.println("enter the number");
		int n=10;
		
		for(i=0;i<=n;i++) {
			for(j=n-i;j>1;j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
