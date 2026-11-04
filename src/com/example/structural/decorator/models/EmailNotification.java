//$Id$
package com.example.structural.decorator.models;

import java.util.Random;

public class EmailNotification implements Notification{

	@Override
	public void sendNotification(String message) {
		System.out.println("From : EmailNotification :"+ message);
	}

	@Override
	public void printCount() {
	   System.out.println(new Random().nextInt());	
	}

}
