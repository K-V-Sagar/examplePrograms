package bubbleSort;

public class bubbleSort {

	public void sort(int numbers[]) {
		for(int i=1; i<numbers.length;i++) {
			for(int j=0;j<numbers.length-1;j++) {
				if(numbers[j]>numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
	}
	
	
	//improvement 1
	public void sort1(int numbers[]) {
		for(int i=1; i<numbers.length;i++) {
			for(int j=0;j<numbers.length-1;j++) {
				if(numbers[j]>numbers[j+1]) {
					swap(numbers,j,j+1);				
				}
			}
		}
	}
	
	
	private void swap(int[] numbers, int j, int k) {
		int temp = numbers[j];
		numbers[j] = numbers[k];
		numbers[k] = temp;
	}
	
	public static void main(String[] args) {
		int a[]= {3,5,2,4,1};
		
		//basic
		System.out.println("Array before sorting:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		bubbleSort obj = new bubbleSort();
		obj.sort(a);
		System.out.println("\n\nArray after sorting:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("*********************");
		
		//improvement 1
		System.out.println("Array before sorting:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		bubbleSort obj1 = new bubbleSort();
		obj.sort1(a);
		System.out.println("\n\nArray after sorting:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
	
}
