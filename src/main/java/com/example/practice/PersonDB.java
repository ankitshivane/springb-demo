package com.example.practice;

import java.util.ArrayList;
import java.util.List;

public class PersonDB {
	public static List<Person> getAllPersons() {
		List<Person> ls = new ArrayList<>();
		Person p1 = new Person("raj", "Mumbai", "m", 30);
		Person p2 = new Person("jack", "Delhi", "m", 50);
		Person p3 = new Person("mike", "chennai", "m", 22);
		Person p4 = new Person("sam", "Mumbai", "m", 31);
		Person p5 = new Person("raj", "Kolkata", "m", 25);
		Person p6 = new Person("aditi", "Mumbai", "f", 22);
		Person p7 = new Person("depali", "chennai", "f", 30);
		ls.add(p1);
		ls.add(p2);
		ls.add(p3);
		ls.add(p4);
		ls.add(p5);
		ls.add(p6);
		ls.add(p7);
		return ls;
	}
}
