package com.cg.project.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.project.mathservices.MathServices;
import com.cg.project.mathservices.MathServicesImpl;

public class MathServicesTest {
	static MathServices mathServices;
	@BeforeClass
	public static void setUPTestEnv(){
		mathServices=new MathServicesImpl();
	}
	@AfterClass
	public static void tearDownTestEnv(){
		mathServices=null;
	}

}
