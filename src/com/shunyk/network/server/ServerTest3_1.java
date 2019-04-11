package com.shunyk.network.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

public class ServerTest3_1 {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sk = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		File file = new File("C:\\test\\menu");
		File file2 = null;
		FileReader fr = null;
		ServerMenu sm = new ServerMenu();

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
			
			String str = br.readLine();
			
			sm.inut();
			if(str.equals("점심")) {
				
			}else if(str.equals("저녁")) {
				
			}else {
				
			}

			
		} catch (Exception e) {
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
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
