//$Id$
package com.example.structural.adapter.example.models;

public class StripePayment implements PaymentInterface {
	@Override
	public void pay(double amount) {
		System.out.println("From stripe payment : "+ amount);
	}
}
