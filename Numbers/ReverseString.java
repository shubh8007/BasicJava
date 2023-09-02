import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1="";
		char a;
		for(int i=0;i<str.length();i++) {
			a=str.charAt(i);
			str1=a+str1;
			
		}
		System.out.println(str1);

	}

}
