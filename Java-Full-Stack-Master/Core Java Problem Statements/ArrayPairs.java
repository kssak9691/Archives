public class ArrayPairs {
	public static void main(String[] args) {
		int arr[]={3,5,6,3,3,5};
		int i,j,len,c=0;
		len=arr.length;
		for(i=0;i<len;i++){
			for(j=i+1;j<len;j++){
				if(arr[i]==arr[j])
					c++;
			}
		}
		System.out.println("No. of Pairs = "+c);
	}
}