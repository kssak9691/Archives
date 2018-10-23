import java.util.Arrays;
public class ThirdLargeArray {
	public static void main(String[] args) {
		int len;
		int array[]={2,54,885,66,88,69,47,2,568,9};
		Arrays.sort(array);
		len=array.length;
		System.out.println("Third largest Element: "+array[len-3]);
	}
}