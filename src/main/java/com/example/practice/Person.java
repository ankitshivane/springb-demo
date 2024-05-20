package com.example.practice;

public class Person {
	private String name;
	private String city;
	private String gender;
	private int age;

	public Person(String name, String city, String gender, int age) {
		super();
		this.name = name;
		this.city = city;
		this.gender = gender;
		this.age = age;
	}

	public Person() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", gender=" + gender + ", age=" + age + "]";
	}
	
	

}
