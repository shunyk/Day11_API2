package com.shunyk.io.file.rw;

import java.util.ArrayList;

public class MemberView {
	
	public void view(String s) {
		System.out.println(s);
	}
	
	public void view(Member member) {
		System.out.print("그룹명 : " + member.getGrup() + "\t");
		System.out.print("이름 : " + member.getName() + "\t");
		System.out.print("나이 : " + member.getAge() + "\t" + "\t");
		System.out.print("담당 : " + member.getPart() + "\t");
		System.out.println("소속사 " + member.getCompany());
	}
	
	public void view(ArrayList<Member> ar) {
		for(Member a:ar) {
			System.out.print("그룹명 : " + a.getGrup() + "\t");
			System.out.print("이름 : " + a.getName() + "\t");
			System.out.print("나이 : " + a.getAge() + "\t" + "\t");
			System.out.print("담당 : " + a.getPart() + "\t");
			System.out.println("소속사 " + a.getCompany());
		}
	}
}
