package com.cg.project.enumassignment;
public enum GenderEnum {
	Male('M'),
	Female('F');	
	private char gender;
	private GenderEnum(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}