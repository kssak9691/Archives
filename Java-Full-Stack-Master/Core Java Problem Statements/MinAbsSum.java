public class MinAbsSum {
	public static void main(String[] args) {
		int arr[]={2,-4,6,-3,9};
		int len,i,j,s,l,k=20000;
		len=arr.length;
		for(i=0;i<len;i++){
			s=0;
			for(j=i;j<len;j++){
				if(i==j)
					s=arr[i];
				else
					s=s+arr[j];
				l=Math.abs(s);
				if(l<k)
					k=l;
			}
		}
		System.out.println(k);
	}
}