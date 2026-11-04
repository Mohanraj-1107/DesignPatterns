//$Id$
package com.example.structural.decorator.models;

public class RetryDecorator extends NotificationDecorator{
	
	public RetryDecorator(Notification notification) {
		super(notification);
	}

	@Override
	public void sendNotification(String message) {
		System.out.println(message+" From RetryDecorator");
		notification.sendNotification(message);
	}

	@Override
	public void printCount() {
		System.out.println("From printcount : RetryDecorator");
		notification.printCount();
	}
}
