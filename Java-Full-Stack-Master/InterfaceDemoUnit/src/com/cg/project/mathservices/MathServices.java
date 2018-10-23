package com.cg.project.mathservices;
import com.cg.project.exception.InvalidNumberRangeException;
public interface MathServices {
	public abstract int addNums(int n1,int n2)throws InvalidNumberRangeException;
	public abstract int multNums(int n1,int n2)throws InvalidNumberRangeException;
	public abstract int subNums(int n1,int n2)throws InvalidNumberRangeException;
}