package com.example.javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arrayList= new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(4400);
		arrayList.add(2200);

		List<Integer> list= arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());
				list.forEach(x-> System.out.println(x));
	}

}
