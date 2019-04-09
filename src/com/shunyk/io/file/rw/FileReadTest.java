package com.shunyk.io.file.rw;

import java.io.BufferedReader;
import java.io.File;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadTest {
	
	public static void main(String[] args) {
		File file = new File("C:\\test", "readTest.txt");
		FileReader fr = null;
		
		BufferedReader br = null;
		String str = null;
		ArrayList<String> ar = new ArrayList<String>();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			br.readLine();
			while(true) {
				str=br.readLine();
				if(str==null) {
					break;
				}
				//String [] names = str.split("-");
				String [] names = str.split("-");
				for(String s:names) {
					ar.add(s);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(String s:ar) {
			System.out.println(s);
		}

	}

}
