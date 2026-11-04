//$Id$
package com.example.creational.builder;

public class Mobile {
	
	private String mobileName;
	private String OsName;
	private int ram;
	private int batteryCapacity;
	private int diskSpace;

	public Mobile(MobileBuilder builder) {
		super();
		this.mobileName = builder.mobileName;
		OsName = builder.OsName;
		this.ram = builder.ram;
		this.batteryCapacity = builder.batteryCapacity;
		this.diskSpace = builder.diskSpace;
	}

	@Override
	public String toString() {
		return "Mobile [mobileName=" + mobileName + ", OsName=" + OsName + ", ram=" + ram + ", batteryCapacity=" + batteryCapacity + ", diskSpace=" + diskSpace + "]";
	}
}
