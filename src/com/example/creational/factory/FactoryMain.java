//$Id$
package com.example.creational.factory;

public class FactoryMain {
	
	public static void main(String args[]) {
		
		OsInstanceHandler hanlder=new OsInstanceHandler();
		
		OS androidObject=hanlder.getInstance(OsConstants.ANDROID);
		androidObject.getSepc();
		
		OS iosObject=hanlder.getInstance(OsConstants.IOS);
		iosObject.getSepc();
		
		OS windowsObject=hanlder.getInstance(OsConstants.WINDOWS);
		windowsObject.getSepc();
	}

}
