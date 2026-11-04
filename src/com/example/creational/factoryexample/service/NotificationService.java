//$Id$
package com.example.creational.factoryexample.service;
import java.util.*;

import com.example.creational.factoryexample.Factory.EmailNotificationFactory;
import com.example.creational.factoryexample.Factory.NotificationFactory;
import com.example.creational.factoryexample.Factory.PushNotificationFactory;
import com.example.creational.factoryexample.Factory.SMSNotificationFactory;

public class NotificationService {
	
	public static Map<String,String> sendNotification(String type,String message){
		NotificationFactory factory=NotificationFactory.getNotificationFactory(type);
		return factory.getNotificationInstance().sendNotification(message);
	}
}