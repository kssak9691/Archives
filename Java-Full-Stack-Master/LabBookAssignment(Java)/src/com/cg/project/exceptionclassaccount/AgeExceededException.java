package com.cg.project.exceptionclassaccount;

public class AgeExceededException extends Exception {
	public  AgeExceededException() {
		System.out.println("Age of person should be above 15");
	}

}
