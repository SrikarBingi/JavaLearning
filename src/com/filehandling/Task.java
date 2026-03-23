package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task {
	public static void main(String[] args) {
		
//		writeToAFile();
		copyFile();
		
	}
	
	private static void writeToAFile() {
		
		for(int i=1;i<=10;i++) {
			File file = new File(
					"C:/Users/srika/OneDrive/Desktop/JavaLearning/Files/Folder1/"+i+".txt"
					);
			String temp = "This is text in file "+i;
			FileOutputStream fos = null;
			
			try {
				fos = new FileOutputStream(file);
				fos.write(temp.getBytes());
			}
			catch(FileNotFoundException e) {
				System.out.println(e);
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
		
	}
	
	private static void copyFile() {
		
		String sourceFolder = "C:/Users/srika/OneDrive/Desktop/JavaLearning/Files/Folder1/";
		String targetFolder = "C:/Users/srika/OneDrive/Desktop/JavaLearning/Files/Folder2/";
		
		for(int i=1;i<=10;i++) {
			File sourceFile = new File(sourceFolder+i+".txt");
			File targetFile = new File(targetFolder+"new"+i+".txt");
			
			FileInputStream fis =null;
			FileOutputStream fos = null;
			
			try {
				fis = new FileInputStream(sourceFile);
				fos = new FileOutputStream(targetFile);
				
				byte[] bytes = new byte[1024];
				int temp;
				while((temp=fis.read(bytes))!=-1) {
					fos.write(bytes,0,temp);
				}
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}
