package com.java.functional;

import java.util.function.Consumer;


// Traditional Way

/*class ConsumerImpl implements Consumer<String>{

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println("Input : " + t);
	}
	
}*/

public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		// Traditional Way
		
		//Consumer<String> s = new ConsumerImpl();
		
		//s.accept("Gaurav");
		
		Consumer<String> consume= (s) -> System.out.println("Input : " + s);
		
		consume.accept("Gaurav");
		
	}
}
