package com.example.MethodReference;
@FunctionalInterface
public interface FunctionInterfaceDemo {
	//Single Abstract method 
	void singleAbstractMethod();

	//Multiple default & static methods
	
	default void exampleOne() {
		System.out.println("I can do this");
	}
	default void exampleTwo() {
		System.out.println("I will  get a new job with good salary");
	}
	static void exampleStaticMethod() {
		System.out.println("I'm a good programmer");
	}

}
