package com.star;

public class KStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size =4;
		
           for(int i=size;i>=-size;i-- ) {
        	   for(int j=0;j<=Math.abs(i);j++) {
        		   System.out.print(" * ");
        	   }
        	   System.out.println();
           }
	}

}
