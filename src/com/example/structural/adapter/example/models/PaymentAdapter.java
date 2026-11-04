//$Id$
package com.example.structural.adapter.example.models;

public class PaymentAdapter implements PaymentInterface{

	@Override
	public void pay(double amount) {
		//calling the thirdparty payment method
		ThirdPartyPayement.payAmount(amount);
	}
}
