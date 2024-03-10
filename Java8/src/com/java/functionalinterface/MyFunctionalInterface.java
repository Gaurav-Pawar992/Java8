package com.java.functionalinterface;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	void print(String msg);
	
	default void m1() {
		System.out.println("Default Method");
	}
	
	static void m2() {
		System.out.println("Static Method");
	}

}
