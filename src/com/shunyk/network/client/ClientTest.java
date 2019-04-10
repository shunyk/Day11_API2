package com.shunyk.network.client;

import java.net.Socket;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.Exception;

public class ClientTest {

	public static void main(String[] args) {
		OutputStream os = null;
		Socket s = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		String str;
		ClientInfo c;
		try {
			s = new Socket("211.238.142.26", 8180);
			System.out.println("서버와 접송 성공");
			os = s.getOutputStream(); //byte
			ow = new OutputStreamWriter(os); //char
			bw = new BufferedWriter(ow);
			is = s.getInputStream(); //byte
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			sc = new Scanner(System.in);
			c = new ClientInfo();
			while(true) {

				str = c.sendeServer(bw, sc);
				
				if(str.equals("종료")) {
					break;
				}
				
				str = c.receiveServer(br);
				
				if(str.equals("종료")) {
					break;
				}
				
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Client 종료");

	}

}
