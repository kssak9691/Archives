import java.util.Scanner;
public class PossitiveAndNegativeUsingCommandLine {
static Scanner k=new Scanner(System.in);
	public static void main(String[] args) {
		int number;
		number=k.nextInt();
		if (number==0) 
			System.out.println("Its is neither possitive nor negative");
		else if(number>0)
			System.out.println("Its is  possitive ");
		else 
			System.out.println("Its is negative");
	}

}
