//$Id$
package com.example.structural.facade;

import com.example.structural.facade.models.OrderFacade;

public class Main {
	
	public static void main(String args[]) {
		OrderFacade orderObject=new OrderFacade();
		orderObject.placeOrder("prod1", 1, 200,"Chennai");
		orderObject.placeOrder("prod2", 10, 200,"Chennai");
//		orderObject.placeOrder("prod3", 1, 200,"Chennai");
//		orderObject.placeOrder("prod4", 1, 200,"Chennai");
	}
}
