package edu.handong.csee.java.lab13.prob4;

public class Animal {
	private String name;
	public Animal (String a)
	{
		this.name = a; // put String name when creating constructor
	}
	public void getName()
	{
		System.out.println("Name: "+name); // if we call getName, print out the name.
	}
}
