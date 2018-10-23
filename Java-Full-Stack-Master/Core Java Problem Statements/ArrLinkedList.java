public class ArrLinkedList {
	public static void main(String[] args) {
		int arr[]={1,4,-1,3,2};
		int j=0,c=0,len;
		len=arr.length;
		while(arr[j]!=-1 && arr[j]<len){
			c++;
			j=arr[j];
		}
		System.out.println(c+1);
	}
}