package com.shunyk.io.file;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FileTest4 {

	public static void main(String[] args) {
		File file = new File("C:\\test\\shunyk");
		String [] ar = file.list();
		/*for(int i=0; i<ar.length; i++) {
			if(ar[i].lastIndexOf("jpeg") > 0 || ar[i].lastIndexOf("jpg") > 0 || ar[i].lastIndexOf("png") > 0 || ar[i].lastIndexOf("bmp") > 0 || ar[i].lastIndexOf("gif") > 0 || ar[i].lastIndexOf("pcx") > 0 || ar[i].lastIndexOf("raw") > 0) {
				System.out.println("이미지입니다.");
			}else {
				File file2 = new File(file, ar[i]);
				file2.delete();
			}
		}
		
		file = new File("C:\\test");
		Scanner sc = new Scanner(System.in);
		System.out.println("폴더명 입력");
		String name = sc.next();
		File file2 = new File(file, name);
		if(file2.mkdir() == true) {
			file2.mkdir();
			System.out.println("생성 완료");
		}else {
			file2.delete();
			System.out.println("삭제 완료");
		}*/
		
		file = new File("C:\\test");
		ar = file.list();
		Random rd = new Random();
		String name = Integer.toString(rd.nextInt(Integer.MAX_VALUE));
		File file2 = new File(file, name);
		/*for(int i=0; i<ar.length; i++) {
			if(ar[i].equals(name) == false) {
				file2.mkdir();
			}
		}
		if(file.compareTo(file2) != 0) {
			file2.mkdir();
		}*/
		
	}

}
