package com.java.optional;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		
		// To create optional object we can use several methods
		// of, empty, ofNullable
		
		String email = "gaurav@gmail.com";
//		String email = null;
		
		// Object Creation Through empty() method
		
		Optional<Object> emptyOtional=Optional.empty();
		System.out.println(emptyOtional);
		
		// Object Creation Through of() method --> Gives exception if object is null
		
		Optional<String> emailOptional = Optional.of(email);
		System.out.println(emailOptional);

		// Object Creation Through ofNullable() method --> Gives empty object if object is null

		Optional<String> stringOptional = Optional.ofNullable(email);
		System.out.println(stringOptional);

		
		// isPresent() Method
		
		if(stringOptional.isPresent()) {									// We always first use isPresent Method to check get method
			System.out.println(stringOptional.get());               
		}
		else {
			System.out.println("No Such Data Present");
		}
		
		
		// orElse() Method
		
		String defaultOtional = stringOptional.orElse("default@gmail.com");
		System.out.println(defaultOtional);
		
		// orElseGet() Method  --> Supplier interface & Lambda Expression
		
		String defaultOtional2 = stringOptional.orElseGet(() -> "default@gmail.com");
		System.out.println(defaultOtional2);
		
		// orElseThrow() Method  --> Value not present is optional then throw exception
		
		String defaultOtional3 = stringOptional.orElseThrow(() -> new IllegalArgumentException("Email doesn'exist"));
		System.out.println(defaultOtional3);

		// ifPresent() Method  --> Value not present is optional then throw exception
		
		Optional<String> gender = Optional.of("MALE");
		Optional<String> emptyOpt = Optional.empty();
		
		gender.ifPresent((s) -> System.out.println("Value is Present"));
		emptyOpt.ifPresent((s) -> System.out.println("No Value is Present"));
		
		// filter Method  --> Value not present is optional then throw exception

		String result ="abc";
		
		if(result!=null && result.contains("abc")) {
			System.out.println(result);
		}
		
		
		Optional<String> resultOptional = Optional.of(result);
		
		resultOptional.filter((res) -> res.contains("abc"))
					  .ifPresent((res) -> System.out.println(res));
		
		// map Method  --> provides a way to transform value in optional from one type to another
		
		String result2 =" xyz ";
		
		Optional<String> resultOptional2 = Optional.of(result2);
		
		resultOptional2.filter((res2) -> res2.contains("xyz"))
					   .map(String::trim)
					  .ifPresent((res2) -> System.out.println(res2));


		
	}
}
