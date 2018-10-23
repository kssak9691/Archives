public class MultiPairs {
	public static void main(String[] args) {
		int arr1[]={0,1,2,2,3,5};
		int arr2[]={500000,500000,0,0,0,20000};
		int i,j;
		long  c=0;
		double arr3[] = new double[6];
		for(i=0;i<6;i++){
			arr3[i]=arr1[i]+((double)arr2[i]/1000000);
		}
		for(i=0;i<6;i++){
			for(j=i+1;j<6;j++){
				if((arr3[i]*arr3[j])>=(arr3[i]+arr3[j]))
					c++;
			}
		}
		if(c>1000000000)
			c=1000000000;
		System.out.println("No. of Multiplicative Pairs = "+c);
	}
}