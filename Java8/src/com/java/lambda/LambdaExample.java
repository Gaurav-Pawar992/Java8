package com.java.lambda;

interface Shape{
	void draw();
}

// Traditional Way

/*
 * class Rectangle implements Shape{
 * 
 * @Override public void draw() {
 * System.out.println("Rectangle Class Draw Method"); }
 * 
 * }
 * 
 * class Square implements Shape{
 * 
 * @Override public void draw() {
 * System.out.println("Square Class Draw Method"); }
 * 
 * }
 * 
 * class Circle implements Shape{
 * 
 * @Override public void draw() {
 * System.out.println("Circle Class Draw Method"); }
 * 
 * }
 */



public class LambdaExample {
	
	public static void main(String[] args) {
		
		//Shape rectangle =() -> {System.out.println("Rectangle Class Draw Method");};	 As we have single line body we ignore {}	
		
	//	Shape rectangle =() -> System.out.println("Rectangle Class Draw Method");		
	//	rectangle.draw();       Commented for testing method parameter
		
	//	Shape square =() -> System.out.println("Square Class Draw Method");		
	//	square.draw();
		
	//	Shape circle =() -> System.out.println("Circle Class Draw Method");		
	//	circle.draw();
		
	//	print(rectangle);
	//	print(square);
	//	print(circle);
		
		print(()->System.out.println("Rectangle Class Draw Method"));
		print(()->System.out.println("Square Class Draw Method"));
		print(()->System.out.println("Circle Class Draw Method"));
		
	}
	
	// Pass lambda expression as method parameter
	
	private static void print (Shape shape) {
		shape.draw();
	}
	
}
