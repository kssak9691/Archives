package com.cg.project.strings;
import java.util.Arrays;
import java.util.Scanner;
public class SortUpperLower {
	static Scanner k= new Scanner(System.in);
	public static void main(String[] args) {
		int i;
		System.out.print("Enter size of array: ");
		int size = k.nextInt();
		String str[] = new String[size];
		System.out.println("Enter strings:");
		for(i = 0; i < size; i++)
			str[i] = k.next();
		for(i=0;i<size;i++)
			str[i]=str[i].toUpperCase();
		Arrays.sort(str);
		if(size%2==0){
			for(i=0;i<size/2;i++)
				str[i]=str[i].toUpperCase();
			for(i=size/2;i<size;i++)
				str[i]=str[i].toLowerCase();
		}
		else{
			for(i=0;i<(size/2)+1;i++)
				str[i]=str[i].toUpperCase();
			for(i=(size/2)+1;i<size;i++)
				str[i]=str[i].toLowerCase();
		}
		for(i=0;i<size;i++)
			System.out.println(str[i]);
	}
}