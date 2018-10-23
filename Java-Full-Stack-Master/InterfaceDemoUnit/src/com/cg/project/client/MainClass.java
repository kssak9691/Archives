package com.cg.project.client;
import com.cg.project.exception.InvalidNumberRangeException;
import com.cg.project.mathservices.MathServices;
import com.cg.project.mathservices.MathServicesImpl;
public class MainClass {
	public static void main(String[] args) {
		try{
		MathServices services=new MathServicesImpl();
		services.multNums(-4, 20);
		services.addNums(-45, 20);
		}
		catch(InvalidNumberRangeException e){
			e.printStackTrace();
		}
	}
}