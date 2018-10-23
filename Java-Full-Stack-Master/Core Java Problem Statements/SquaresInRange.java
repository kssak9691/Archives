public class SquaresInRange {
	public static void main(String[] args) {
		int a=6,b=42,c=0;
		double i,k;
		for(i=a;i<=b;i++){
			k=Math.sqrt(i);
			if(k==(int)k)
				c++;
		}
		System.out.println("No. of Perfect Squares in between "+a+" and "+b+" = "+c);
	}
}