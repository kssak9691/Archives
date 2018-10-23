public class Palindrome {
	public static void main(String[] args) {
		int num=1221,temp,rem=0,rev=0;
		temp=num;
		while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;		
		}
		if(num==rev)
			System.out.println(num+" is a Palindromic Number");
		else
			System.out.println(num+" is  not a Palindromic Number");
	}
}