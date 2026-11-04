//$Id$
package com.example.structural.composite;

public class Files implements Components{
	
	public String fileName;
	
	public Files(String fileName) {
		this.fileName=fileName;
	}

	@Override
	public void print() {
	   System.out.println("FileName : "+this.fileName);
	}
}
