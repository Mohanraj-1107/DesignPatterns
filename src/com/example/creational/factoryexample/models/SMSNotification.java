//$Id$
package com.example.creational.factoryexample.models;
import java.util.Map;
import java.util.HashMap;


public class SMSNotification implements Notification{
	
	@Override
	public Map<String, String> sendNotification(String message) {
		Map<String,String> response=new HashMap<>();
	    response.put("status","success");
	    response.put("message",message);
	    return response;
	}
}
