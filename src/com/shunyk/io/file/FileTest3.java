package com.shunyk.io.file;

import java.io.File;
import java.util.StringTokenizer;

public class FileTest3 {

	public static void main(String[] args) {
		File file = new File("C:\\test");
		String str = "iu-suji-choa,hani";
		str = str.replace("-", ",");
		System.out.println(str);
		StringTokenizer st = new StringTokenizer(str, ",");
		
		String [] ar = str.split(",");
		for(int i=0; i<ar.length; i++) {
		System.out.println(ar[i]);
		}
		
		while(st.hasMoreTokens()) {
			File file2 = new File(file, st.nextToken());
			file2.delete();
			//file2.mkdir();
		}

	}

}
