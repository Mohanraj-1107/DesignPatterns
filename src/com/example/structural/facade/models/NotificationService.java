//$Id$
package com.example.structural.facade.models;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NotificationService {
	
	private static final Logger logger=Logger.getLogger(NotificationService.class.toString());
	
	public void sendConfirmation(String message) {
		logger.log(Level.INFO,"From Notification Service : "+message);
	}
	
}
