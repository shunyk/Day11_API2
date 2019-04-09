package com.shunyk.io.file;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("C:\\test\\ex1.txt");
		file = new File("C:\\test", "ex1.txt");
		file = new File("C:\\test");
		File file2 = new File(file, "ex1.txt");
		File file3 = new File("C:\\");
		/*System.out.println(file.exists()); //파일 존재 여부
		System.out.println(file.isDirectory()); //폴더인가
		System.out.println(file.isFile());	//파일인가
		System.out.println(file.getName()); //이름 호출
		System.out.println(file.getParent()); //부모 호출(상위 폴더)
		System.out.println(file.length());*/ //크기 출력
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
