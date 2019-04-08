package com.shunyk.io.file;

import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {
		File file = new File("C:\\");
		/*String [] ar = file.list();	//이름을 가져옴
		for(int i=0; i<ar.length; i++) {
			File file2 = new File(file, ar[i]);
			if(file2.isFile()) {
				System.out.println(ar[i] + "의 크기는 " + file2.length() + "Byte");
			}else {
				System.out.println(ar[i] + "는 폴더입니다.");
			}
		}*/
		
		File [] f = file.listFiles();	//파일을 가져옴
		for(int i=0; i<f.length; i++) {
			if(f[i].isFile()) {
				System.out.println(f[i] + "의 크기는 " + f[i].length() + "Byte");
			}else {
				System.out.println(f[i] + "는 폴더입니다.");
			}
		}

	}

}
