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
import java.util.Scanner;

public class ServerTest3 {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sk = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		File file = new File("C:\\test");
		File file2 = null;
		FileReader fr = null;

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
			String str = null;
			Random random = new Random();
			ArrayList<String> ar = new ArrayList<String>();
			
			
			
			String s = br.readLine();
			System.out.println("Message : " + s);
			
			if(s.equals("점심")) {
				file2 = new File(file, "lunch.txt");
				fr = new FileReader(file2);
				br = new BufferedReader(fr);
				str=br.readLine();
				while(true) {
					

					str=br.readLine();
					System.out.println(str);
					if(str==null) {
						break;
					}
					ar.add(str);
				}

				int num = random.nextInt(ar.size());
				
				bw.write(ar.get(num));
				bw.write("\r\n");
				bw.flush();
			}else if(s.equals("저녁")) {
				file2 = new File(file, "dinner.txt");
				fr = new FileReader(file2);
				br = new BufferedReader(fr);
				str=br.readLine();
				while(true) {
					str=br.readLine();
					System.out.println(str);
					if(str==null) {
						break;
					}
					ar.add(str);
				}
				int num = random.nextInt(ar.size());
				
				bw.write(ar.get(num));
				bw.write("\r\n");
				bw.flush();
			}else {
				file2 = new File(file, "lunch.txt");
				fr = new FileReader(file2);
				br = new BufferedReader(fr);
				str=br.readLine();
				while(true) {
					str=br.readLine();
					System.out.println(str);
					if(str==null) {
						break;
					}
					ar.add(str);
				}
				file2 = new File(file, "dinner.txt");
				fr = new FileReader(file2);
				br = new BufferedReader(fr);
				str=br.readLine();
				while(true) {
					str=br.readLine();
					System.out.println(str);
					if(str==null) {
						break;
					}
					ar.add(str);
				}
				int num = random.nextInt(ar.size());
				
				bw.write(ar.get(num));
				bw.write("\r\n");
				bw.flush();
			}
			
		} catch (IOException e) {
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
