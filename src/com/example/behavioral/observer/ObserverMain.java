//$Id$
package com.example.behavioral.observer;

public class ObserverMain {
	
	public static void main(String args[]) {
		
		Channel channel1=new Channel("Channel-1");
		Observer sub1=new Subscriber("sub1");
		Observer sub2=new Subscriber("sub2");
		Observer sub3=new Subscriber("sub3");
		Observer sub4=new Subscriber("sub4");
		Observer sub5=new Subscriber("sub5");
		channel1.addObserver(sub1);
		channel1.addObserver(sub2);
		channel1.addObserver(sub3);
		channel1.addObserver(sub4);
		channel1.addObserver(sub5);
		channel1.removeObserver(sub5);
		channel1.uploadVideo(" Demo video ");
		
		Channel channel2=new Channel("Channel-2");
		Observer sub11=new Subscriber("sub11");
		Observer sub21=new Subscriber("sub21");
		Observer sub31=new Subscriber("sub31");
		Observer sub41=new Subscriber("sub41");
		Observer sub51=new Subscriber("sub51");
		channel2.addObserver(sub11);
		channel2.addObserver(sub21);
		channel2.addObserver(sub31);
		channel2.addObserver(sub41);
		channel2.addObserver(sub51);
		channel2.removeObserver(sub51);
		channel2.uploadVideo(" Demo video Channel 2 ");
	}

}
