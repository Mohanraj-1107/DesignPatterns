//$Id$
package com.example.structural.decorator.models;

abstract class NotificationDecorator implements Notification{
	
	public final Notification notification;
	
	public NotificationDecorator(Notification notification) {
		this.notification=notification;
	}
}
