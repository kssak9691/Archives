package com.cg.project.mathservices;

import com.cg.project.exception.InvalidNumberRangeException;

public class MathServicesImpl implements MathServices {

	@Override
	public int addNums(int n1, int n2)throws InvalidNumberRangeException {
			int n3;
			if(n1<0 || n2<0)throw new InvalidNumberRangeException("Enter the numeber greater than 0");
			n3=n1+n2;
		return n3;
	}

	@Override
	public int multNums(int n1, int n2)throws InvalidNumberRangeException{
		if(n1<0 || n2<0) throw new InvalidNumberRangeException("Enter the numeber greater than 0");
		return n1*n2;
	}

	@Override
	public int subNums(int n1, int n2)throws InvalidNumberRangeException {
		if(n1<0 || n2<0) throw new InvalidNumberRangeException("Enter the numeber greater than 0");
		return n1-n2;
	}
	

}
