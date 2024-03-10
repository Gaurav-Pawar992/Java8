package com.java.functional;

import java.util.function.Function;


// Traditional Way 

class FunctionImpl implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
	}
	
}

public class FunctionDemo {

		public static void main(String[] args) {
			
			// Traditional Way 
			
			/*
			 * Function<String, Integer> function = new FunctionImpl();
			 * System.out.println(function.apply("GAURAV"));
			 */
			
			
			Function<String, Integer> functionLambda = (input) -> input.length();
			
			System.out.println(functionLambda.apply("GAURAV PAWAR"));
			
		}
}
