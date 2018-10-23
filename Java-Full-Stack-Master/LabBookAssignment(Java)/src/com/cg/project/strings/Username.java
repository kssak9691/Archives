package com.cg.project.strings;
import java.util.Scanner;
public class Username {
	static Scanner k= new Scanner(System.in);
	public static void main(String[] args) {
		String username;
		username=k.next();
		if(username.length()>=12)
			validUsername(username);
		else
			System.out.println("false");
	}
	public static void validUsername(String username) {
		int i=username.length()-4,j=username.length();
		String str=username.substring(i, j);
		if(str.compareTo("_job")==0)
			System.out.println("true");
		else
			System.out.println("false");		
	}
}