public class LeaderArray {
	public static void main(String[] args) {
		int arr[]={2,2,2,2,2,3,4,4,4,6};
		int i,j,len,c,k=0;
		len=arr.length;
		for(i=0;i<len;i++){
			c=0;
			for(j=0;j<len;j++){
				if(arr[i]==arr[j])
					c++;
			}
			if(c>len/2){
				k++;
				System.out.println(arr[i]+" is the leader of array");
				break;
			}
		}
		if(k==0)
			System.out.println("No Leader");
	}
}