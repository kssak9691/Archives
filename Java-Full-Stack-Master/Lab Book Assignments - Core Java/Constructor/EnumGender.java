package com.cg.project.Constructor;
public enum EnumGender {
	Male('M'),
	Female('F');
	private char gender;
	private EnumGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}