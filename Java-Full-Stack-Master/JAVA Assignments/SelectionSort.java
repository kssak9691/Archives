public class SelectionSort {
	public static void main(String[] args) {
		int len, i, j, k;
		int arr[] = {2,74,58,365,1,9,556,25,8};
		len=arr.length;
		for ( i = 0; i < len- 1; i++)
		{
			k = i;
			for ( j = i + 1; j <len; j++)
				if (arr[j] < arr[k]) 
					k = j;
			int smallerNumber = arr[k];  
			arr[k] = arr[i];
			arr[i] = smallerNumber;
		}
		for (i = 0; i < len; i++) 
			System.out.print(arr[i]+"  ");
	}
}