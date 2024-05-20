package com.example.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeTest {
	public static void main(String[] args) {
		String input = "ankitshivane";
		Map<Character, Integer> charCount = new HashMap<>();
		for (char c : input.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> e : charCount.entrySet()) {
			if (e.getValue() == 1) {
				System.out.println("First non repeating character:"+e.getKey());
				break;
			}
		}
	}
	
}
