package com.example.MethodReference;

public class MethodReferenceDemo {

	public static void main(String args[]) {

		/**
		 * For method referencing
		 */

		FunctionInterfaceDemo f1 = test::methodSample;
		f1.singleAbstractMethod();
		/**
		 * For lambda expression
		 */
		// FunctionInterfaceDemo funtionalInterface= ()->System.out.println("i hope this
		// will work");
		// funtionalInterface.singleAbstractMethod();

	}
}

class test {

	public static void methodSample() {
		System.out.println("I hope this will also work!!");
	}

}