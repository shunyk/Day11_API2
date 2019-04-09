package com.shunyk.io.file.rw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {

	public static void main(String[] args) {
		File file = new File("C:\\test", "writeTest.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, true);
			fw.write("Fiveth Write\r\n");
			fw.flush(); //버퍼를 강제로 비우기
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}