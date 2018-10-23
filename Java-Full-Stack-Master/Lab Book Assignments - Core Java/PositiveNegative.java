import java.util.Scanner;
public class PositiveNegative {
	static Scanner k = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		num=k.nextInt();
		if(num==0)
			System.out.println("Neither Positive nor Negative");
		else if(num>0)
			System.out.println("Positive Number");
		else
			System.out.println("Negative Number");
	}
}