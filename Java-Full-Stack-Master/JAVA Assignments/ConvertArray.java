public class ConvertArray {
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,9,10},i,j=0,k=0;
		int b[]=new int[10];
		for(i=9;i>=5;i--){
			b[k]=a[i];
			k++;
			while(j<5){
				b[k]=a[j];
				j++;
				k++;
				break;
			}
		}
		for(i=0;i<=9;i++){
			a[i]=b[i];
		}
		for(i=0;i<=9;i++){
			System.out.println(a[i]);
		}
	}
}	