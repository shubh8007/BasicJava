
public class MissingNo {

	public static void main(String[] args) {
		int[] arr= {4,8,12,20};
		
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]!=4) {
				System.out.println(arr[i]+4);
			}
		}

	}

}
