//$Id$
package com.example.structural.decorator.models;

public class LoggingDecorator extends NotificationDecorator {
	
	public LoggingDecorator(Notification notification) {
		super(notification);
	}

	@Override
	public void sendNotification(String message) {
		System.out.println(message+" From LoggingDecorator");
		notification.sendNotification(message);
	}

	@Override
	public void printCount() {
		System.out.println("From printcount : LoggingDecorator");
		notification.printCount();
	}	
}
