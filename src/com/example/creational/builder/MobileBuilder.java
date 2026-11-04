//$Id$
package com.example.creational.builder;

public class MobileBuilder {
	
	public String mobileName;
	public String OsName;
	public int ram;
	public int batteryCapacity;
	public int diskSpace;
	
	public MobileBuilder setMobileName(String mobileName) {
		this.mobileName = mobileName;
		return this;
	}
	
	public MobileBuilder setOsName(String osName) {
		OsName = osName;
		return this;
	}
	
	public MobileBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
	public MobileBuilder setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
		return this;
	}
	
	public MobileBuilder setDiskSpace(int diskSpace) {
		this.diskSpace = diskSpace;
		return this;
	}
	
	public Mobile build() {
		return new Mobile(this);
	}
}
