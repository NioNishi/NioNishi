package com.example.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		/*Function is a predefined functional interface
		 which only contains one abstract method which is apply
		Function is used to some result which may be any type
		 */
		
		Function<Integer, Integer> squareme=i->i*i;
		System.out.println("The square value is "+ squareme.apply(125));
		// TODO Auto-generated method stub

	}

}
