package com.example.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmployeeSort {
	public static void main(String[] args) {
		List<Employee> el = new ArrayList<>();
//	el.stream().sorted(Comparator.comparing(Employee::getName)).thenComparing(Employee::getAge).collect(Collectors.toList());
		String s = "I am a software engineer";
		Set<Character> missingChar = IntStream.range('a', 'z' + 1).mapToObj(c -> (char) c).collect(Collectors.toSet())
				.stream().filter(ch -> !s.toLowerCase().contains(String.valueOf(ch))).collect(Collectors.toSet());
		if (!missingChar.isEmpty()) {
			for (Character character : missingChar) {
//				System.out.print(character+" ");
			}
		}

		String str = "abcabcbaaaa";
		int len = lengthOfLongestSub(str);
		System.out.println("->" + len);
	}

	public static int lengthOfLongestSub(String input) {
		int n = input.length();
		int res = 0;
		int i = 0, j = 0;
		Set<Character> charSet = new HashSet<>();
		while (i < n && j < n) {
			charSet.add(input.charAt(j));
			j++;

			while (charSet.contains(input.charAt(i))) {
				charSet.remove(input.charAt(i));
				i++;
			}
			res = Math.max(res, j - i);
		}
		return res;
	}
}
