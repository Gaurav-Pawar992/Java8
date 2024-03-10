package com.java.functional;

import java.time.LocalDateTime;
import java.util.function.Supplier;


// Traditional Way

/*class SupplierImpl implements Supplier<LocalDateTime>{

	@Override
	public LocalDateTime get() {
		// TODO Auto-generated method stub
		return LocalDateTime.now();
	}
	
}*/

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		// Traditional Way
		
	//	Supplier<LocalDateTime> supplier = new SupplierImpl();
		
	//	System.out.println(supplier.get());
		
		Supplier<LocalDateTime> supplier1= () -> LocalDateTime.now();
		
		System.out.println(supplier1.get());
		
	}
	

}