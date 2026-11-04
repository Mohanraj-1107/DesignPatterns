//$Id$
package com.example.structural.decorator.models;

public class EncryptionDecorator extends NotificationDecorator{
	
	public EncryptionDecorator(Notification notification) {
		super(notification);
	}

	@Override
	public void sendNotification(String message) {
		System.out.println(message+" From EncryptionDecorator");
		notification.sendNotification(message);
	}

	@Override
	public void printCount() {
		System.out.println("From printcount : EncryptionDecorator");
		notification.printCount();
	}
	
}
