package com.htd.assigements;

public class Student {
	int rollno;
	String name;
	static String college = "GGGI";

	public Student(int r, String n) {
		rollno = r;
		name = n;
		college = "Sind";
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}
