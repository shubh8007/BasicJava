import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str="Shubham";
		String cstr="";
		
		char ch;
		for(int i=0;i<str.length();i++) {
			 ch=str.charAt(i);
			 cstr=ch+cstr;
			 
		}
		System.out.println(cstr);
			
	}

}
