package com.example.diamondproblem.defaultmethod;

public interface FunctionalInterfaceOne {
	
	default void sampleMethod() {
		System.out.println("First implementation");
	}

}
