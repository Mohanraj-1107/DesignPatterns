//$Id$
package com.example.creational.factoryexample.Factory;
import com.example.creational.factoryexample.models.Notification;

public interface NotificationFactory {
	
	public Notification getNotificationInstance();
	
	enum NotificationFactoryTypes{
		
		EMAIL("email",new EmailNotificationFactory()),
		PUSH("push",new PushNotificationFactory()),
		SMS("sms",new SMSNotificationFactory());
		
		private String  name;
		private NotificationFactory instance;
		
		public String getName() {
			return name;
		}
		
		public NotificationFactory getInstance() {
			return instance;
		}

		NotificationFactoryTypes(String name,NotificationFactory instance) {
			this.name=name;
			this.instance=instance;
		}
	}
	
	public static NotificationFactory getNotificationFactory(String type) {
		 for(NotificationFactoryTypes ntype:NotificationFactoryTypes.values()) {
			 if(ntype.getName().equals(type)){
				 return ntype.getInstance();
			 }
		 }
		 return null;
	}
}
