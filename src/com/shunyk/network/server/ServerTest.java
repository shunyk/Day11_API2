package com.shunyk.network.server;

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

public class ServerTest {

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
		String str = null;
		ServerInfo si = null;
		try {

			System.out.println("클라이언트 접속받을 준비중");
			ss = new ServerSocket(8180);
			sk = ss.accept();
			System.out.println("Server : 연결 성공");
			is = sk.getInputStream(); //byte
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			os = sk.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			si = new ServerInfo();
			while(true) {
				str = si.receiveClient(br);
				
				if(str.equals("종료")) {
					break;
				}
				
				str = si.sendeClient(bw, sc);
				
				if(str.equals("종료")) {
					break;
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				sk.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
