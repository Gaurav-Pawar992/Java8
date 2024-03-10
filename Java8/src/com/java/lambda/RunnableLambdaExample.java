package com.java.lambda;


// Traditional Way

/*class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("Run Method Called...");		
	}
	
}*/

public class RunnableLambdaExample {

	public static void main(String[] args) {
		
		// Traditional Way 
		
		//Thread thread = new Thread(new ThreadDemo());
		//thread.start();
		
		//Runnable runnable = () -> System.out.println("Run Method Using Lambda");       We can use following statement also
		
		//Thread thread1 = new Thread(runnable);    
		
		Thread thread1 = new Thread(() -> System.out.println("Run Method Using Lambda"));
		
		thread1.start();
		
	}
}
