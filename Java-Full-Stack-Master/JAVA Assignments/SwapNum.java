public class SwapNum {
	public static void main(String[] args) {
    int a=5 , b=3;
    a=a-b;
    b=a+b;
    a=b-a;
    System.out.println("Numbers after swapping are \na="+a+"  b="+b);
	}
}