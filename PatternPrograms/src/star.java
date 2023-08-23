package com.app.traingle;

import java.util.Scanner;

public class star {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=5;
	for(int i=0;i<n;i++) {
		for(int j=2*(i-1);j<n;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
