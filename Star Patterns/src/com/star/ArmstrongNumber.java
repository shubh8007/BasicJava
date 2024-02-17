package com.star;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no=sc.nextInt();
		String s=Integer.toString(no);
		int size=s.length();
		int armStrongno=0;
		for(char digit:s.toCharArray()) {
			int value=Character.getNumericValue(digit);
			armStrongno+=Math.pow(value, size);
		}
      if(no==armStrongno) {
    	 System.out.println("True");
      }
      else {
		System.out.println("False");
	}
	}

}
