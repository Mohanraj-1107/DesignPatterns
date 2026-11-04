//$Id$
package com.example.structural.composite;
import java.util.*;

public class Folders implements Components{
	
	public String folderName;
	
	List<Components> components=new ArrayList<>();
	
	public Folders(String folderName) {
		this.folderName=folderName;
	}

	@Override
	public void print() {
		
        System.out.println("FOLDER : "+this.folderName);
 
        for(Components component:components) {
        	component.print();
        }
        
        System.out.println();
	}
	
	public void addComponent(Components component) {
		components.add(component);
	}
}
