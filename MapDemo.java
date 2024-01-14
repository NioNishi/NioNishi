package com.example.javastreams;

import java.util.ArrayList;

public class MapDemo {
	
	public static void main(String args[]) {
		

		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(100);
		a1.add(200);
		a1.add(435);
		
//		Stream s1= a1.stream().map(i->i*i);
//		s1.forEach(x->System.out.println(x));
		
		a1.stream().map(i->i*i).forEach(x->System.out.println(x));
	}

}
