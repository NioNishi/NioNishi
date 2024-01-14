package com.example.javastreams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FilterDemo {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(100);
		a1.add(200);
		a1.add(435);
		
//		Stream s1= a1.stream().filter(i->i%2==0);
//		s1.forEach(x->System.out.println(x));
		
		a1.stream().filter(i->i%2==0).forEach(x->System.out.println(x));
		
		
		
		
	}

}
