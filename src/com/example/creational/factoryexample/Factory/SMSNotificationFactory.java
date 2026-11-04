//$Id$
package com.example.creational.factoryexample.Factory;

import com.example.creational.factoryexample.models.Notification;
import com.example.creational.factoryexample.models.SMSNotification;

public class SMSNotificationFactory implements NotificationFactory {

	@Override
	public Notification getNotificationInstance() {
		return new SMSNotification();
	}
}
