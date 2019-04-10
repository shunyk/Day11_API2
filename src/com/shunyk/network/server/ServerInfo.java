package com.shunyk.network.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class ServerInfo {
	
	private String s;
	
	public String sendeClient(BufferedWriter bw, Scanner sc) throws IOException {
		System.out.println("클라이언트에게 보낼 메세지 입력");
		s = sc.next();
			bw.write(s);
			bw.write("\r\n");
			bw.flush();
		return s;
	}

	public String receiveClient(BufferedReader br) throws IOException{
			s = br.readLine();
			System.out.println("Message : " + s);
		return s;
	}
	
}
