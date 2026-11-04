//$Id$
package com.example.creational.prototype;

public class Circle implements Shape{
	
	private String color;
	
	public Circle(String color) {
		this.color=color;
	}
	
	public Shape clone(){
		return new Circle(this.color);
	}

	public void draw() {
	   System.out.println("From clone method");	
	}

	@Override
	public String toString() {
		return "Circle [color=" + color + "]";
	}
	
}
