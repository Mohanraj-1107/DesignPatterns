//$Id$
package com.example.structural.adapter.example;

import com.example.structural.adapter.example.models.PaymentAdapter;
import com.example.structural.adapter.example.models.PaymentInterface;
import com.example.structural.adapter.example.models.StripePayment;

public class Main {
	
	public static void main(String args[]) {
		PaymentInterface payment=new PaymentAdapter();
		PaymentInterface stripePayment=new StripePayment();
		payment.pay(100D);
		payment.pay(100D);
		stripePayment.pay(100D);
		stripePayment.pay(200D);
	}
}
