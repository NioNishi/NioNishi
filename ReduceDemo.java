package com.example.javastreams;

import java.util.ArrayList;
import java.util.List;

public class ReduceDemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arrayList= new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(4400);
		arrayList.add(220);
		
		Integer i1= arrayList.stream().reduce((a,b)->a+b).get();
		
		System.out.println(i1);
	}

}
