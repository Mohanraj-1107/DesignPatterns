//$Id$
package com.example.creational.prototype;

public class PrototypeMain {
	
	public static void main(String args[]) {
		Shape circle=new Circle("red");
		System.out.println(circle);
		
		ShapeClient client=new ShapeClient(circle);
		Shape clonedObject=client.createClient();
		System.out.println(clonedObject);
	}
}
