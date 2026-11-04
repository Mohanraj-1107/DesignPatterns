//$Id$
package com.example.creational.factoryexample.Factory;

import com.example.creational.factoryexample.models.EmailNotification;
import com.example.creational.factoryexample.models.Notification;

public class EmailNotificationFactory implements NotificationFactory{

	@Override
	public Notification getNotificationInstance() {
		return new EmailNotification();
	}

}
