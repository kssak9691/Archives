public class LongSubString {
	public static void main(String[] args) {
		int i,l=0,c=0,len,max=0;
		String str="a0Ba1aBaBaB";
		len=str.length();
		for(i=0;i<len;i++){
			if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z')){
				l++;
				if(str.charAt(i)>='A' && str.charAt(i)<='Z')
					c++;
			}
			else{
				l=0;
				c=0;
			}	
			if(c>=1){
				if(l>max)
					max=l;
			}
		}	
		System.out.println(max);
	}
}