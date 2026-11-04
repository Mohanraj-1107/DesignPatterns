//$Id$
package com.example.creational.factory;

public class OsInstanceHandler {
	
	public OS getInstance(String osType) {
		
		if(osType==null || osType.isEmpty()) {
			System.out.print("OS Type is null");
			return null;
		}
		Constants cons=Constants.getOsEnum(osType);
		
		switch(cons) {
		    case ANDROID:
		    	return new AndroidOs();
		    case IOS:
		    	return new IOS();
		    case WINDOWS:
		    	return new Windows();
		    default:
		    	System.out.println("Passed os type is invalid");
		    	return null;   
		}
	}
}

class OsConstants{
	 public static final String ANDROID="android";
	 public static final String IOS="ios";
	 public static final String WINDOWS="windows";
}

enum Constants{
	ANDROID("android"),
	IOS("ios"),
	WINDOWS("windows");
	
	private String osName;
	
	Constants(String osName) {
		this.osName=osName;
	}
	
	public String getOsName() {
		return this.osName;
	}
	
	public static Constants getOsEnum(String osName) {
		for(Constants cons:Constants.values()) {
			if(cons.getOsName().equals(osName)) {
				return cons;
			}
		}
		return null;
	}
}