package _17_Array_Sorting;

public class _01_Array01 {
	public static void main(String[] args) {
		int arr[] = {4,6,7,9,2,3};
		
		displayArr(arr);
		sort01(arr);
		System.out.println("After Sort: ");
		displayArr(arr);
	}
//	Array Sorting
	
	public static void displayArr(int[] arr) {
		for(int i=0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void sort01(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
