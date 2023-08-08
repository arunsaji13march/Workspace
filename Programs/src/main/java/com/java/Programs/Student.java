package com.java.Programs;

public class Student {
	String name;
	int age;
	double fees;
	public Student(String name, int age, double fees) {
		super();
		this.name = name;
		this.age = age;
		this.fees = fees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", fees=" + fees + "]";
	}
	
	

}
