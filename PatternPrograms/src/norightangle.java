package com.app.traingle;

import java.util.Scanner;

public class norightangle {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int i;int j;
	System.out.println("Enter the size");
	int n=5;
	for(i=0;i<n;i++) {
	  for(j=0;j<=i;j++) {
		  System.out.print("$");
	  }
	  System.out.println(" ");
	}
   
	}

}
