package com.shunyk.network.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class ClientInfo {
	
	private String s;

	public String sendeServer(BufferedWriter bw, Scanner sc) throws IOException{
		System.out.println("서버로 보낼 메세지 입력");
		s = sc.next();
			bw.write(s);
			bw.write("\r\n");
			bw.flush();
		return s;
	}
	
	public String receiveServer(BufferedReader br) throws IOException{
			s = br.readLine();
			System.out.println("Message : " + s);
		return s;
	}
	
}
