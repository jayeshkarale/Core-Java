package _17_Array_Sorting;

// 2. Selection Sort

public class _01_SelectionSort {
	public static void main(String[] args) {
		
		int arr1[]= {7,5,9,3,1,2};
		
		for(int i=0;i<arr1.length-1; i++) {
			int smallest=i;
			for(int j=i+1; j<arr1.length; j++) {
				if(arr1[smallest]>arr1[j]) {
					smallest=j;
				}
			}
			int temp=arr1[smallest];
			arr1[smallest]=arr1[i];
			arr1[i]=temp;
		}
		System.out.println("Sorted Array: ");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}
