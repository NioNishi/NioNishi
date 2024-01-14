package com.example.javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arrayList= new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(4400);
		arrayList.add(220);

		Stream<Integer> list= arrayList.stream().filter(i->i%2==0);
		 long l=list.count();
		 System.out.println(l);
				//list.forEach(x-> System.out.println(x));
	}

}
