package com.cg.project.strings;
import java.util.Scanner;
public class ValidUserName {
	static Scanner k= new Scanner(System.in);
	public static void main(String[] args) {
		String str=k.next();
		CheckUserName(str);
	}
	public static void CheckUserName(String str) {
		if(str.length()>=12){
			int i=str.length()-4,j=str.length();
			String str1=str.substring(i,j);
			if(str1.compareTo("_job")==0) 
				System.out.println("TRUE");
			else
				System.out.println("FALSE");
		}
		else
			System.out.println("FALSE");
	}
}