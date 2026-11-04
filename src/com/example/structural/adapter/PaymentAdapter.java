//$Id$
package com.example.structural.adapter;

public class PaymentAdapter implements Payment{
	
	private ThridPartyPayment thridPartyPayment;
	
	public PaymentAdapter(){
		this.thridPartyPayment=new ThridPartyPayment();
	}
	
	@Override
	public void payAmount() {
		thridPartyPayment.initiatePayment();
	}
	
}
