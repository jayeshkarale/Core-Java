package _18_Arrays;

public class _04_Array {
	public static void main(String[] args) {
		
		String names[]= {"jayesh","karan","om","Ashish" };
		
		int marks[]= new int[4];
		marks[0]=45;
		marks[1]=46;
		marks[2]=35;
		marks[3]=32;
		
		int size = marks.length;
		System.out.println("Array Size: "+size);
		
		for(int i=0; i<marks.length; i++) {
			System.out.println(names[i]+"-"+marks[i]);
		}
	}
	
}
