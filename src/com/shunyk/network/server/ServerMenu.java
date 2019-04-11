package com.shunyk.network.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

public class ServerMenu {

	private String [] lunch;
	private String [] dinner;
	private Random rd;
	private String menu;

	public ServerMenu() {
		rd = new Random();
		menu = null;
	}

	public void inut() throws Exception {
		File file = new File("C:\\test\\menu\\lunch.txt");
		//lunch
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		String menus = br.readLine();
		lunch = menus.split("-");
		br.close();
		fr.close();
		file = new File("C:\\test\\menu\\dinner.txt");
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		br.readLine();
		menus = br.readLine();
		dinner = menus.split("-");
		br.close();
		fr.close();

	}

	public String getLunch() {
		int num = rd.nextInt(lunch.length);
		menu = lunch[num];
		return menu;
	}

	public String getDinner() {
		int num = rd.nextInt(dinner.length);
		menu = dinner[num];
		return menu;
	}

	public String random() {
		int num = rd.nextInt(2);
		if(num == 0) {
			getLunch();
		}else {
			getDinner();
		}
		return menu;
	}


}
