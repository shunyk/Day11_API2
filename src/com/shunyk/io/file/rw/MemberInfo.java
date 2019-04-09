package com.shunyk.io.file.rw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class MemberInfo {
	
	private ArrayList<Member> searchCompany(Scanner sc, ArrayList<Member> ar) {
		ArrayList<Member> ar2 = new ArrayList<Member>();
		System.out.println("소속사 입력");
		String com = sc.next();
		for(Member m:ar) {
			if(m.getCompany().equals(com)) {
				ar2.add(m);
			}
		}
		return ar2;
	}
	private ArrayList<Member> searchTeam(Scanner sc, ArrayList<Member> ar){
		ArrayList<Member> ar2 = new ArrayList<Member>();
		System.out.println("그룹명 입력");
		String grup = sc.next();
		for(Member m:ar) {
			if(m.getGrup().equals(grup)) {
				ar2.add(m);
			}
		}
		return ar2;
	}
	
	public ArrayList<Member> searchGroup (Scanner sc, ArrayList<Member> ar){
		ArrayList<Member> ar2 = new ArrayList<Member>();
		System.out.println("원하는 번호 선택");
		System.out.println("1번 그룹명 검색");
		System.out.println("2번 소속사 검색");
		int select = sc.nextInt();
		if(select == 1) {
			ar2 = this.searchTeam(sc, ar);
		}else if(select == 2){
			ar2 = this.searchCompany(sc, ar);
		}
		
		return ar2;
		
	}

	public ArrayList<Member> info() {
		File file = new File("C:\\test", "readTest.txt");
		FileReader fr = null;

		BufferedReader br = null;
		String str = null;
		ArrayList<Member> ar = new ArrayList<Member>();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			br.readLine();
			while(true) {
				str=br.readLine();
				if(str==null) {
					break;
				}
				String [] names = str.split("-");
				Member member = new Member();
				member.setGrup(names[0]);
				member.setName(names[1]);
				member.setAge(Integer.parseInt(names[2]));
				member.setPart(names[3]);
				member.setCompany(names[4]);
				ar.add(member);

				/*StringTokenizer st = new StringTokenizer(str, "=");
				Member member = new Member();
				member.setGrup(st.nextToken());
				member.setName(st.nextToken());
				member.setAge(Integer.parseInt(st.nextToken()));
				member.setPart(st.nextToken());
				member.setCompany(st.nextToken());
				ar.add(member);*/
				
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
		
		return ar;
		

	}
	
	public Member searchMember(Scanner sc, ArrayList<Member> ar) {
		System.out.println("찾는 멤버 이름 입력");
		String s = sc.next();
		Member member = null;
		for(Member m:ar) {
			if(s.equals(m.getName())) {
				member = m;
			}
		}
		return member;
	}
	
}
