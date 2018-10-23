package com.cg.project.strings;
import java.util.*;
public class StringOperationsMainClass {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String string;
		int choice;
		System.out.println("Enter String");
		string = s.nextLine(); 
		System.out.println("Enter your choice\n1.Add the String to itself \n2.Replace odd positions with #"+
				"\n3.Remove duplicate characters in the String \n4.Change odd characters to upper case");
		choice = s.nextInt();
		switch(choice){
		case 1:
			string=string+string;
			System.out.println(string);
			break;
		case 2:
		    StringBuilder sb = new StringBuilder();
		    for(int i=0; i<string.length(); i++){
		        char currChar = string.charAt(i);
		            if (i%2==0) 
		                currChar = '#';
		        sb.append(currChar);
		    }
		    System.out.println(sb);
		    break;
		case 3:
			String str = new String(); 
	        int len = string.length(); 
	        for (int i = 0; i < len; i++)  
	        { 
	            char c = string.charAt(i); 
	            if (str.indexOf(c) < 0)
	                str += c; 
	        }
	        System.out.println(str);
	        break;
		case 4:
			StringBuilder sb2 = new StringBuilder();
	        for(int i=0;i<string.length();i++){
	             char c = string.charAt(i);
	             if(i%2==0)
	                sb2.append(String.valueOf(c).toUpperCase());
	             else
	            	 sb2.append(c);
	        }
	        System.out.println(sb2);
		}
	}
}
