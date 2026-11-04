//$Id$
package com.example.structural.decorator;

import com.example.structural.decorator.models.EmailNotification;
import com.example.structural.decorator.models.EncryptionDecorator;
import com.example.structural.decorator.models.LoggingDecorator;
import com.example.structural.decorator.models.Notification;
import com.example.structural.decorator.models.RetryDecorator;

public class Main {
	
	public static void main(String args[]) {
		Notification notification=new EmailNotification();
		notification=new LoggingDecorator(notification);
		notification=new EncryptionDecorator(notification);
		notification=new RetryDecorator(notification);
		notification.sendNotification("message");
		notification.printCount();
	}
	
}
