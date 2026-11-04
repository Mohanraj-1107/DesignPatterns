//$Id$
package com.example.structural.facade.models;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InventoryService {
	
	private  static final Map<String,Integer> inventoryItems=new HashMap<>();
	private static final Logger logger=Logger.getLogger(InventoryService.class.toString());
	
	static {
		inventoryItems.put("prod1",10);
		inventoryItems.put("prod2",4);
		inventoryItems.put("prod3",5);
		inventoryItems.put("prod4",1);
	}
	
	public boolean checkStock(String product, int quantity) {
	   if(product == null || quantity==0) {
		   logger.log(Level.SEVERE,"Product or Quantity is null");
		   return false;
	   }
	   return inventoryItems.getOrDefault(product,0)>=quantity;
	}
	
}
