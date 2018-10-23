import java.util.*;
public class BinarySearch {
	public static void SearchKey(int array[],int a,int b,int c){
		int mid=(a+b)/2;
		if(c<array[a] || c>array[b]){
			System.out.println("Not Found");
			return;
		}
		if(c==array[mid]){
			System.out.println("Key is found at position "+mid);
		}
		else if(c>array[mid]){
			SearchKey(array,mid+1,b,c);
		}
		else{
			SearchKey(array,a,mid-1,c);
		}
	}
	public static void main(String[] args) {
		int len,n;
		int arr[]={2,54,574,245,885,656,58,145,65};
		//Arrays.sort(arr);
		len=arr.length;
		n=85;
		Arrays.sort(arr);
		SearchKey(arr,0,len-1,n);
	}
}
