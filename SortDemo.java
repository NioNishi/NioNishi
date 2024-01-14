package com.example.javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(4400);
		arrayList.add(220);

		/*
		 * sorting without filtering
		 */

		// Stream<Integer> filteredStream=arrayList.stream().sorted();

		/*
		 * Filtered sorting
		 */

		//Stream<Integer> filteredStream = arrayList.stream().filter(i -> i >= 20).sorted();
		
		/*
		 * desending order sorting
		 */
		Stream<Integer> filteredStream = arrayList.stream().filter(i -> i >= 20).sorted((i1,i2)->i1.compareTo(i2));


		filteredStream.forEach(x -> System.out.println(x));

	}

}
