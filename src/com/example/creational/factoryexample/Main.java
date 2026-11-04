//$Id$
package com.example.creational.factoryexample;
import java.util.*;
import com.example.creational.factoryexample.service.NotificationService;

public class Main {

	public static void main(String[] args) {
		 Map<String,String> response1=NotificationService.sendNotification("email","From Email Notification");
		 Map<String,String> response2=NotificationService.sendNotification("push","From Push Notification");
		 Map<String,String> response3=NotificationService.sendNotification("sms","From SMS Notification");
		 System.out.println(response1);
		 System.out.println(response2);
		 System.out.println(response3);
	}
}
