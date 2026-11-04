//$Id$
package com.example.creational.singleton;

public class SingletonMain {
	
	public static void main(String args[]) {
		ConfigurationManager manager1=ConfigurationManager.getInstance();
		ConfigurationManager manager2=ConfigurationManager.getInstance();
		ConfigurationManager manager3=ConfigurationManager.getInstance();
		System.out.println(manager1);
		System.out.println(manager2);
		System.out.println(manager1==manager2);
		System.out.println(manager2==manager3);
	}

}
