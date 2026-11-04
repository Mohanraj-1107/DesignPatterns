//$Id$
package com.example.creational.factoryexample.Factory;

import com.example.creational.factoryexample.models.Notification;
import com.example.creational.factoryexample.models.PushNotification;

public class PushNotificationFactory implements NotificationFactory{

	@Override
	public Notification getNotificationInstance() {
		return new PushNotification();
	}

}
