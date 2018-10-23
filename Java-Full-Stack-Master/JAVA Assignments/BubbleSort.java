public class BubbleSort {
	public static void main(String[] args) {
		int len, i, j, temp;
		int arr[] = {3,34,14,22,5,6,87,2};
		len=arr.length;
		for (i = 0; i < len - 1; i++) {
			for (j = 0; j < len - i - 1; j++) {
				if (arr[j] > arr[j+1]) 
				{
					temp= arr[j];
					arr[j]   = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (i = 0; i < len; i++) 
			System.out.print(arr[i]+"  ");
	}
}