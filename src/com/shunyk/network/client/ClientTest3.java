package com.shunyk.network.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest3 {

	public static void main(String[] args) {
		OutputStream os = null;
		Socket s = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
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
			
			System.out.println("원하는 메뉴는? 점심? 저녁?");
			String str = sc.next();
			bw.write(str);
			bw.write("\r\n");
			bw.flush();
			
			str = br.readLine();
			System.out.println("Message : " + str);
		} catch (Exception e) {
			// TODO: handle exception
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

	}

}
