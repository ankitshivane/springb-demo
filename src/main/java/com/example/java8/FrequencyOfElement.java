package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElement {
	/*
	 * How do you find frequency of each element in an array or a list?
	 * 
	 */
	public static void main(String[] args) {
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
				"Note Book", "Pencil");
		Map<String, Long> collect = stationeryList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect.entrySet().stream().forEach(i -> {
			System.out.println("Key:" + i.getKey() + "->" + "count:" + i.getValue());
		});
	}
}
