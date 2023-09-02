import java.util.ArrayList;
import java.util.List;
/*1 problem given as
Given string array :- [Rohan,Typqrh,Sabcdz,Sameer]
Output :- Typqrh, Sabcdz
Need tk print only this 2 names because of pqr and abc are continue words in alphabet*/
public class Substring {
	public static boolean match(String s) {
		 
		for(int i=0;i<s.length()-3;i++) {

		String str1=s.substring(i, i+3);
		if(str1.equals("pqr")||str1.equals("abc")) {
			return true;
		}
		}
		return false;
	}
public static void main(String[] args) {
	String[] str= {"shubham","dpqrj","jabck"};
	List<String> str1=new ArrayList<>();
for(String s:str) {
	if(match(s)) {
		str1.add(s);
	}
	
	
}
System.out.println(str1+" ");
}
}

