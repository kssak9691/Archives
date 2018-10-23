package com.cg.project.exceptionclass;
public class FullNameNotFoundException extends Exception{
	public FullNameNotFoundException() {
		System.out.println("Full name invalid");
	}	
}