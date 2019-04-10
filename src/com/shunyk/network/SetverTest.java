package com.shunyk.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SetverTest {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sk = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("클라이언트 접속받을 준비중");
			ss = new ServerSocket(8180);
			sk = ss.accept();
			System.out.println("Server : 연결 성공");
			is = sk.getInputStream(); //byte
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			String s = br.readLine();
			System.out.println("Message : " + s);
			os = sk.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			System.out.println("클라이언트에게 보낼 메세지 입력");
			String str = sc.next();
			bw.write(str);
			bw.write("\r\n");
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				ir.close();
				is.close();
				sc.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
