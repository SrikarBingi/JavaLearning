package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
//		createNewFile();
		
//		readFromAFile();
		
//		writeToAFile();
		
//		fileCopy();
		
	}

//	private static void fileCopy() {
//		File file1 = new File("C:/Users/srika/OneDrive/Desktop/JavaLearning/Files/a.txt");
//		File file2 = new File("C:/Users/srika/OneDrive/Desktop/JavaLearning/Files/b.txt");
//		
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
//		
//		try {
//			fis = new FileInputStream(file1);
//			fos = new FileOutputStream(file2);
//			int temp;
//			while((temp=fis.read())!=-1) {
//				fos.write(temp);
//			}
//		}
//		catch(FileNotFoundException e) {
//			System.out.println(e);
//		}
//		catch(IOException e) {
//			System.out.println(e);
//		}
//	}

//	private static void writeToAFile() {
//		File file = new File("C:/Users/srika/OneDrive/Desktop/JavaLearning/Files/a.txt");
//		String temp = "Dont stop learning. \n";
//		FileOutputStream fos = null;
//		
//		try {
//			fos = new FileOutputStream(file,true);
//			fos.write(temp.getBytes());
//		}
//		catch(FileNotFoundException e) {
//			System.out.println(e);
//		}
//		catch(IOException e) {
//			System.out.println(e);
//		}
//	}

//	private static void //readFromAFile() {
//		File file = new File("C:/Users/srika/OneDrive/Desktop/JavaLearning/Files/a.txt");
//		FileInputStream fis = null;
//		
//		try {
//			fis = new FileInputStream(file);
//			int temp;
//			while((temp=fis.read())!=-1) {
//				System.out.println((char)temp);
//			}
//		}
//		catch(FileNotFoundException e) {
//			System.out.println(e);
//		}
//		catch(IOException e) {
//			System.out.println(e);
//		}
//	}

//	private static void createNewFile() {
//		File file = new File("C:/Users/srika/OneDrive/Desktop/JavaLearning/Files/a.txt");
//		try {
//			file.createNewFile();
//		}
//		catch(FileNotFoundException e) {
//			System.out.println(e);
//		}
//		catch(IOException e) {
//			System.out.println(e);
//		}
//	}
}
