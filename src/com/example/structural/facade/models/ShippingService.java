//$Id$
package com.example.structural.facade.models;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ShippingService {
	
	private static final Logger logger=Logger.getLogger(ShippingService.class.toString());

	public void createShipment(String address) {
		logger.log(Level.FINE,"From Shipping service : Shipping initiated to adderess {0}",new Object[] {address});
	}
}
