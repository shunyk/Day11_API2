package com.shunyk.io.file.rw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberAdd {

	public Member addMember(Scanner sc) {
		Member member = new Member();
		System.out.println("그룹명 입력");
		member.setGrup(sc.next());
		System.out.println("이름 입력");
		member.setName(sc.next());
		System.out.println("나이 입력");
		member.setAge(sc.nextInt());
		System.out.println("담당 입력");
		member.setPart(sc.next());
		System.out.println("소속사 입력");
		member.setCompany(sc.next());
		return member;
	}

	public void backUp(ArrayList<Member> ar) {
		File file = new File("C:\\test", "readTest.txt");
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			br.readLine();
			for(int i=0; i<ar.size(); i++) {
				fw = new FileWriter(file, true);
				StringBuffer sb = new StringBuffer();

				String str =ar.get(i).getGrup()+"-"+ar.get(i).getName()+"-"+ar.get(i).getAge()+"-"+ar.get(i).getPart()+"-"+ar.get(i).getCompany();
				for(Member m:ar) {
					if(str.equals(br.readLine()) == false) {
						fw.write(m.getGrup()+"-"+m.getName()+"-"+m.getAge()+"-"+m.getPart()+"-"+m.getCompany()+"\r\n");
					}

					fw.flush(); //버퍼를 강제로 비우기
				}
			}
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
