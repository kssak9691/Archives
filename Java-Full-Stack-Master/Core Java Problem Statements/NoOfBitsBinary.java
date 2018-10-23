public class NoOfBitsBinary {
	public static void main(String[] args) {
		int a=13,b=7,c,rem1,i=1,k=0;
		long binaryNum=0,rem2;
		c=a*b;
		while(c>0){
			rem1 = c% 2;
			binaryNum +=  rem1*i;
			i=i*10;
			c =c/ 2;     
		}
		while(binaryNum>0){
			rem2=(int)binaryNum%10;
			if(rem2==1)
				k++;
			binaryNum=binaryNum/10;
		}
		System.out.println(k);
	}
}