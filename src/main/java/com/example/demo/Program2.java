package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program2 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("ankit");
		names.add("sam");
		names.add("karan");
		names.add("jack");
		names.add("mike");
		names.add("karan");
		names.add("sam");
		names.add("viky");
		List<String> namesStarWithK = names.stream().filter(result -> result.startsWith("k"))
				.collect(Collectors.toList());
//		System.out.println(namesStarWithK);

		Map<String, Long> namesCount = names.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(namesCount);
		namesCount.entrySet().stream().filter(i -> i.getValue() > 1)
				.forEach(i -> System.out.println(i.getKey() + ":" + i.getValue()));
		
	}

}
