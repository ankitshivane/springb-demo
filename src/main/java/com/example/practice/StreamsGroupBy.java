package com.example.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGroupBy {

	public static void main(String[] args) {

		Map<String, List<Person>> collect = PersonDB.getAllPersons().stream()
				.collect(Collectors.groupingBy(Person::getCity));
//		System.out.println(collect);
//		collect.entrySet().stream().forEach(i -> System.out.println(i.getKey() + "-------------" + i.getValue()));

		Map<String, Long> collect2 = PersonDB.getAllPersons().stream()
				.collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
//		collect2.entrySet().stream().forEach(i -> System.out.println(i.getKey() + "-------------" + i.getValue()));

		Map<Boolean, List<Person>> collect3 = PersonDB.getAllPersons().stream()
				.collect(Collectors.partitioningBy(i -> i.getAge() > 25));
//		collect3.entrySet().stream().forEach(i -> System.out.println(i.getKey() + "-------------" + i.getValue()));

//		System.out.println("The Count:" + getCount());
		getSum();

	}

	public static long getCount() {
		return PersonDB.getAllPersons().stream().filter(i -> i.getCity().equalsIgnoreCase("Mumbai"))
				.collect(Collectors.counting());
	}
	
	public static void getSum() {
		
		double sumUsingMap = PersonDB.getAllPersons().stream().mapToInt(i->i.getAge()).average().getAsDouble();
		System.out.println("Using Map:"+sumUsingMap);
		
		
	}
	

}
