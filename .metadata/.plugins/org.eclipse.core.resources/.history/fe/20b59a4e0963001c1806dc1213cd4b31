package com.super_class;

public class SuperConstructorVsSuperKeyword {
// Just a Test File
}

// Java Program to Illustrate super keyword

// Class 1
// Base class
// Here it is vehicle class
class Vehicle {

	// Attribute
	int maxSpeed = 120;
}

// Class 2
// sub class Car extending vehicle
class Car extends Vehicle {
	int maxSpeed = 180;

	// Method
	void display() {
		// Printing maxSpeed of parent class (vehicle) as
		// super keyword refers to parent class
		System.out.println("Maximum Speed: " + super.maxSpeed); // Maximum Speed: 120
	}
}

//Java code to demonstrate super()

//Class 1
//Helper class
//Parent class - Superclass
class Person {

	// Constructor of superclass
	Person() {
		// Print statement of this class
		System.out.println("Person class Constructor");
	}
}

//Class 2
//Helper class
//Subclass extending the above superclass
class Student extends Person {
	Student() {
		// Invoking the parent class constructor
		// with the usage of super() word
		super(); // Super is defined by the JVM internally. So, defining it here is an optional one.

		// Print statement whenever subclass constructor is
		// called
		System.out.println("Student class Constructor");
	}
}
