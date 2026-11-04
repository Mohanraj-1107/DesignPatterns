//$Id$
package com.example.creational.builder;

public class BuilderMain {
	
	public static void main(String args[]) {
		
		Mobile object=new MobileBuilder().
				setBatteryCapacity(1000).
				setDiskSpace(20).
				setMobileName("Iphone16").setOsName("i126").setRam(12).build();
		
		System.out.println(object);
	}
}
