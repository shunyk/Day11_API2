package com.shunyk.io;

import java.io.IOException;
import java.io.InputStream;

public class test1 {

	public static void main(String[] args) {
		System.out.println("입력");
		InputStream is = System.in;
		try {
			int num = is.read();	//1Byte만 읽어들임
			System.out.println((char)num);
			num = is.read();
			System.out.println((char)num);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("종료");
	}

}
