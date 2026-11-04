//$Id$
package com.example.structural.facade.models;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderFacade {
	
	private InventoryService inventoryService;
	private NotificationService notificationService;
	private PaymentService paymentService;
	private ShippingService shippingService;
	
	private static final Logger logger=Logger.getLogger(OrderFacade.class.toString());
	
	public OrderFacade() {
		inventoryService=new InventoryService();
		notificationService=new NotificationService();
		paymentService=new PaymentService();
		shippingService=new ShippingService();
	}
	
	public void placeOrder( String product,int quantity, double amount,String address) {
		boolean isProductAvailable=inventoryService.checkStock(product, quantity);
		if(!isProductAvailable) {
			logger.log(Level.SEVERE,"Order product not available");
			return;
		}
		notificationService.sendConfirmation("Order placed");
		boolean isPaymentCompleted=paymentService.processPayment(amount);
		if(!isPaymentCompleted) {
			logger.log(Level.SEVERE,"Payment Failed , Order Not Placed");
			return;
		}
		shippingService.createShipment(address);
	}
}
