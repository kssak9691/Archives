import java.util.Arrays;
public class OneSwapSort {
	public static void main(String[] args) {
		int len,i,c=0;
		int arr1[]={13,2,5,6,8,1};
		len=arr1.length;
		int arr2[]=new int[len];
		for(i=0;i<len;i++)
			arr2[i]=arr1[i];
		Arrays.sort(arr2);
		for(i=0;i<len;i++){
			if(arr1[i]!=arr2[i])
				c++;
		}
		if(c<=2)
			System.out.println("Sorting is possible with one swap");
		else
			System.out.println("Sorting isn't possible with one swap");
	}
}