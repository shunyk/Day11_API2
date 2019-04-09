package com.shunyk.io.file.rw;

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
		try {
			for(int i=0; i<ar.size(); i++) {
			fw = new FileWriter(file, true);
			fw.write(ar.get(i).getGrup()+"-"+ar.get(i).getName()+"-"+ar.get(i).getAge()+"-"+ar.get(i).getPart()+"-"+ar.get(i).getCompany()+"\r\n");
			fw.flush(); //버퍼를 강제로 비우기
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
