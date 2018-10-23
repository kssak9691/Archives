public class InsertionSort {
	public static void main(String[] args) {
		int[] array = {3,34,14,22,5,6,87,2};
		int n = array.length; 
		int i,j,k;
		for ( j = 1; j < n; j++) {  
			k = array[j];  
			i = j-1;  
			while ( (i > -1) && ( array [i] > k) ) {  
				array [i+1] = array [i];  
				i--;  
			}  
			array[i+1] = k;  
		}  
		System.out.println("Sorted array is:");
		for (i = 0; i < n; i++) 
			System.out.print(array[i]+"  ");
	}
}