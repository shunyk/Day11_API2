package com.shunyk.network.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ServerTest2 {

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
			System.out.println("클라이언트에게서 메시지 대기중");
			is = sk.getInputStream(); //byte
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			os = sk.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			String s = br.readLine();
			System.out.println("Message : " + s);
			ArrayList<String> ar = new ArrayList<String>();
			
			StringTokenizer st = new StringTokenizer(s, "-");
			while(st.hasMoreTokens()) {
				ar.add(st.nextToken());
			}
			Random random = new Random();
			int num = random.nextInt(ar.size());
			
			bw.write(ar.get(num));
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
