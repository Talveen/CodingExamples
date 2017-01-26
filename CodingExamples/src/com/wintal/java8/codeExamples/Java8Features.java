package com.wintal.java8.codeExamples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Java8Features {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);list.add(4);list.add(3);list.add(2);list.add(1);
		
		list.forEach(System.out::println);
		
		Java8Features features = new Java8Features();
		features.sortUsingJava7(list);
		System.out.println(list);
		
		features.streamsExample();
	}
	
	public void sortUsingJava7(List<Integer> list1){
		
		Collections.sort(list1, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		
	}
	
	private void streamsExample(){
		
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
	}

}
