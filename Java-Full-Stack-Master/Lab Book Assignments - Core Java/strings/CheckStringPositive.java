package com.cg.project.strings;
import java.util.Scanner;
public class CheckStringPositive {
	static Scanner k= new Scanner(System.in);
	public static void main(String[] args) {
		int c=0;
		String str,temp;
		str=k.next();
		temp=str;
		str=str.toUpperCase();
		for(int i=0;i<str.length()-1;i++){
			int j=i+1;
			if(str.charAt(i)>str.charAt(j))
				c++;
		}
		if(c==0)
			System.out.println(temp+" is a Positive String");
		else
			System.out.println(temp+" is a Negative String");
	}
}