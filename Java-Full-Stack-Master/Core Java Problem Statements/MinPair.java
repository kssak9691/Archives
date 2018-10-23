public class MinPair {
	public static void main(String[] args) {
		int arr[]={7,5,3,8,1,5};
		int len,i,k;
		len=arr.length;
		k=1000000000;
		for(i=0;i<len-2;i++){
			if(arr[i]+arr[i+2]<k)
				k=arr[i]+arr[i+2];
		}
		System.out.println(k);
	}
}