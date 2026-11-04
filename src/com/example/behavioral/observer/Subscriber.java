//$Id$
package com.example.behavioral.observer;

public class Subscriber implements Observer{
	
	private String name;
	
	public Subscriber(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void getNotification(String title) {
        System.out.println("Hey "+this.name+" Video uploaded "+title);
	}
}
