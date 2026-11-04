//$Id$
package com.example.structural.composite;

public class CompositeMain {
	
	public static void main(String args[]) {
		
		 Folders folder1=new Folders("Folder:1");
		 Folders folder2=new Folders("Folder:2");
		 Folders folder3=new Folders("Folder:3");
		 
		 Components file1=new Files("folder1-file1.txt");
		 Components file2=new Files("folder1-file2.txt");
		 Components file3=new Files("folder1-file3.txt");
		 Components file4=new Files("folder1-file4.txt");
		 
		 Components file5=new Files("folder2-file1.txt");
		 Components file6=new Files("folder2-file2.txt");
		 Components file7=new Files("folder2-file3.txt");
		 
		 Components file8=new Files("folder3-file1.txt");
		 Components file9=new Files("folder3-file2.txt");
		 Components file10=new Files("folder3-file3.txt");
		 
		 folder1.addComponent(file1);
		 folder1.addComponent(file2);
		 folder1.addComponent(file3);
		 folder1.addComponent(file4);
		 
		 folder2.addComponent(file5);
		 folder2.addComponent(file6);
		 folder2.addComponent(file7);
		 
		 folder3.addComponent(file8);
		 folder3.addComponent(file9);
		 folder3.addComponent(file10);
		 
		 folder1.print();
		 folder2.print();
		 folder3.print();
	}
}
