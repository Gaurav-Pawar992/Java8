package com.java.lambda;

interface Addable {
	int addition(int a,int b);
}

// Traditional Way

/*
 * class AddableImpl implements Addable{
 * 
 * @Override public int addition(int a, int b) { // TODO Auto-generated method
 * stub return (a+b); }
 * 
 * }
 */

public class LambdaParameters {
	
	public static void main(String[] args) {
		
		Addable add = (a,b)->(a+b);
		
	//	System.out.println(add.addition(10, 20));
		
		int result = add.addition(10,20);
		
		System.out.println(result);
		
	}

}
