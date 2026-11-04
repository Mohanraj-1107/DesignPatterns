//$Id$
package com.example.structural.facade.models;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PaymentService {
	
	private static final Logger logger=Logger.getLogger(PaymentService.class.toString());
	
	public boolean processPayment(double amount) {
		logger.log(Level.INFO,"From payment service : payment received {0}",new Object[]{amount});
		return true;
	}
}
