//$Id$
package com.example.creational.singleton;

public class ConfigurationManager {
	
	private static ConfigurationManager configurationManager;
	
	private ConfigurationManager() {

	}
	
	public static ConfigurationManager getInstance() {
		if(configurationManager==null) {
			return configurationManager=new ConfigurationManager();
		}
		return configurationManager;
	}
}
