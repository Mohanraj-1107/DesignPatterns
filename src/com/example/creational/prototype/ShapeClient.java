//$Id$
package com.example.creational.prototype;

public class ShapeClient {
	
    private Shape shapePrototype;
    
    public ShapeClient(Shape shapePrototype) {
    	this.shapePrototype=shapePrototype;
    }
    
    public Shape createClient() {
    	try {
    		return shapePrototype.clone();
    	}catch(Exception e) {
    		System.out.println("Exception occured");
    		return null;
    	}
    }
}
