public class OpenCloseBrackets {
	public static void main(String[] args) {
		int i,j,o=0,c=0,len,k;
		String str="(())))(";
		len=str.length();
		for(i=0;i<len;i++){
			o=0;
			c=0;
			for(j=0;j<=i;j++){
				if(str.charAt(j)=='(')
					o++;
			}
			for(k=i+1;k<len;k++){
				if(str.charAt(k)==')')
					c++;
			}
			if(o==c){
				break;
			}
		}
		System.out.println(i);
	}
}