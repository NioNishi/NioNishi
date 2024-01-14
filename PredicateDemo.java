package com.example.predicates;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PredicateDemo predicateDemo =new PredicateDemo();
		
		/*Predicate is build in functional interface(Having only one abstract method
		 * Predicate is mainly used to check the boolean condition
		 * Only abstract method in predicate is test
		 * */
		 
		Predicate<String> checklength= s->s.length()>=6;
		System.out.println(checklength.test("Nishika u"));

	}

}
