public class NoDigitsArray {
	public static void main(String[] args) {
		int count1=0,count2=0,count3=0,i;
		int arr[]={1,23,456,85,2};
		for (i = 0; i <5; i++) {
			if (arr[i]/10<1) {
				count1++;
			}
			if (arr[i]/10>=1 && arr[i]/10<10) {
				count2++;
			}
			if (arr[i]/10>=10 && arr[i]/10<100) {
				count3++;
			}
		}
		System.out.println("There are "+count1+" one digited numbers");
		System.out.println("There are "+count2+" two digited numbers");
		System.out.println("There are "+count3+" three digited numbers");
	}
}