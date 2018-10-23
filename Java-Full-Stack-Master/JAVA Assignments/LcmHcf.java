public class LcmHcf {
	public static void main(String[] args) {
		int i,j,a=2,b=4;
		if(a>b)
			i=a;
		else
			i=b;
		for(j=i;;j++){
			if(j%a==0 && j%b==0){
				System.out.println("LCM of "+a+" and "+b+" is "+j);
				break;
			}
		}
		if(a<b)
			i=a;
		else
			i=b;
		for(j=i;j>0;j--){
			if(a%j==0 && b%j==0){
				System.out.println("HCF of "+a+" and "+b+" is "+j);
				break;
			}
		}
	}
}