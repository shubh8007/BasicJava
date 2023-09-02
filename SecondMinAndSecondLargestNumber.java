package Numbers;

public class SecondMinAndSecondLargestNumber {
public static int bubbleSort(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
			  int temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
			}
		}
			
	}
	return -1;
	
}
	public static void main(String[] args) {
		int[] arr= {15,36,98,76,12,14};
		System.out.println("Array before sorting....");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		bubbleSort(arr);
		System.out.println("Array after sorting....");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		System.out.print("second min number:"+arr[1]);
		System.out.println(" ");
		System.out.print("second largest Number:"+arr[arr.length-2]);
	}

}
