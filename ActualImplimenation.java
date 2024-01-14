package com.example.diamondproblem.defaultmethod;

public class ActualImplimenation implements FunctionalInterfaceOne,FunctionalInterfaceTwo {

	
	public static void main(String args[]) {
		ActualImplimenation actualimp=new ActualImplimenation();
		actualimp.sampleMethod();

	}

	@Override
	public void sampleMethod() {
		// TODO Auto-generated method stub
		FunctionalInterfaceTwo.super.sampleMethod();
	}

}
