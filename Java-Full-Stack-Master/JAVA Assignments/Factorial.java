public class Factorial {
	public static void main(String[] args) {
		int n=10,factorial=1,i;
		for(i=1;i<=n;i++){    
			factorial=factorial*i;    
		}    
		System.out.println("Factorial is : "+factorial);    
	}  
}