package com.cg.project.enumassignment;
public class EnumMainClass {
	public static void main(String[] args) {
		ConstructorEnumCreation constructorEnumCreation=new ConstructorEnumCreation("Suprathik", "Barigala", GenderEnum.Male, 987654321);
		System.out.println(constructorEnumCreation.toString());
	}
}