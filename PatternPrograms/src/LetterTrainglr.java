package com.app.traingle;

import java.util.Scanner;

public class LetterTrainglr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int a=65;//ascii value of A
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.print((char)(a+j)+" ");
			}
			System.out.println();
			
		}

	}

}
