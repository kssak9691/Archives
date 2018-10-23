package com.cg.project.strings;
import java.util.Scanner;
public class PossitiveString {
	static Scanner k= new Scanner(System.in);
	public static void main(String[] args) {
		String str,temp;
		int count=0;
		str=k.next();
		temp=str;
		str=str.toLowerCase();
		System.out.println(str);
		for (int i = 0; i < str.length()-1; i++) {
			int j=i+1;
			if(str.charAt(i)<str.charAt(j))
				count++;
		}
		if(count==str.length()-1)
			System.out.println(temp+" is a possitive string");
		else
			System.out.println(temp+" is a negative string");
	}
}