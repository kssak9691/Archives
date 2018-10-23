public class NoOccurences {
	public static void main(String[] args) {
		int num=563252,len,temp,p;
		len = (int) (Math.log10(num) + 1);
		int[] arr=new int[10];
		temp=num;
		for (int i = 0; i <len; i++) {
			p=temp%10;
			arr[p]=arr[p]+1;
			p=0;
			temp=temp/10;
		}
		for (int i = 0; i <=9; i++) {
			System.out.println(i+" is repeated "+arr[i]+" times");
		}
	}
}