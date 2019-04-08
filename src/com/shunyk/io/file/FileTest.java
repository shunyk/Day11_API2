package com.shunyk.io.file;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("C:\\test\\ex1.txt");
		file = new File("C:\\test", "ex1.txt");
		file = new File("C:\\test");
		File file2 = new File(file, "ex1.txt");
		File file3 = new File("C:\\");
		/*System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.length());*/
		String [] str = file3.list();
		
		file = new File("C:\\test\\shunyk\\test2");
		//file.mkdir() 디렉터리 만들기
		//file.mkdirs(); 디렉터리 만들기 (복수)
		file = new File("C:\\test\\test2\\shunyk");
		file.delete();
		
		
		/*for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}*/
	}

}
