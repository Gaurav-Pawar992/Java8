package com.java.methodref;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;


@FunctionalInterface
interface Printable{
	void print(String msg);
}


public class MethodReferenceDemo {
	
	
	public void display(String msg) {
		msg=msg.toUpperCase();
		System.out.println("Message : " + msg);
	}
	
	public static int addition(int a ,int b) {
		return (a+b);
	}
	
	
	public static void main(String[] args) {
	
		
		// 1. Method Reference to a static method 
		
		
		// Lambda Expression
		
		Function<Integer, Double> function = (input) -> Math.sqrt(input);
		System.out.println(function.apply(4));
		
		// Method Reference
		
		Function<Integer, Double> functionMethodRef = Math::sqrt;
		System.out.println(functionMethodRef.apply(9));

		// Lambda Expression
		
		BiFunction<Integer, Integer, Integer> bifunction = (a,b) -> MethodReferenceDemo.addition(a, b);
		System.out.println(bifunction.apply(20, 30));
		
		// Method Reference
		
		BiFunction<Integer, Integer, Integer> bifunctionMethodRef = MethodReferenceDemo::addition;
		System.out.println(bifunctionMethodRef.apply(20, 60));
		
		
/*=================================================================================================================================*/
		
		// 2. Method Reference to an instance method of an object
		
		MethodReferenceDemo obj = new MethodReferenceDemo();

		// Lambda Expression
		
		Printable printable = (input) -> obj.display(input);
		printable.print("gaurav");
		
		// Method Reference
		
		Printable printableMethodRef = obj::display;
		printableMethodRef.print("pawar");
		
/*=================================================================================================================================*/

		// 3. Reference to an instance method of an arbitrary object
		//    Sometimes, we call a method of argument in lambda expression.
		//    In that case , we can use a method reference to call an instance
		//    method of an arbitrary object of a specific type.
		
		// Lambda Expression
		
		Function<String, String> stringFunction= (input) -> input.toLowerCase();
		System.out.println(stringFunction.apply("GAURAV"));
		
		// Method Reference
		
		Function<String, String> stringFunctionMethodRef= String::toLowerCase;
		System.out.println(stringFunctionMethodRef.apply("PAWAR"));
		
/*=================================================================================================================================*/

		// 4. Reference to a constructor
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Lichi");
		
		// Lambda Expression
		
		Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet(fruitsList);
		System.out.println(setFunction.apply(fruits));
		
		// Method Reference
		
		Function<List<String>, Set<String>> setFunctionMethodRef = HashSet::new;
		System.out.println(setFunctionMethodRef.apply(fruits));

		
	}
}
