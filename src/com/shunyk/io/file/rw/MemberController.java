package com.shunyk.io.file.rw;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
	private Scanner sc;
	private MemberInfo mi;
	private MemberView mv;
	private Member member;
	private String s;
	private MemberAdd ma;

	public MemberController() {
		sc = new Scanner(System.in);
		mi = new MemberInfo();
		mv = new MemberView();
		member = new Member();
		s = null;
		ma = new MemberAdd();

	}

	public void start() {
		ArrayList<Member> ar = null;
		while(true) {

			System.out.println("원하는 번호 선택");
			System.out.println("1번 멤버 정보 가져오기");
			System.out.println("2번 멤버 정보 출력하기");
			System.out.println("3번 멤버 검색 출력하기");
			System.out.println("4번 그룹 검색 출력하기");
			System.out.println("5번 멤버 정보 추가하기");
			System.out.println("6번 멤버 정보 백업하기");
			System.out.println("7번 프로그램 종료하기");
			int select = sc.nextInt();
			if(select == 1) {
				ar = mi.info();
				mv.view("멤버 정보를 가져왔습니다");
			}
			else if(select == 2) {
				if(ar != null) {
					mv.view(ar);
				}else {
					mv.view("멤버 정보가 없습니다");
				}
			}
			else if(select == 3) {
				member = mi.searchMember(sc, ar);
				if(member != null) {
					mv.view(member);
				}else {
					mv.view("찾으시는 멤버가 없습니다");
				}

			}else if(select == 4){
				ArrayList<Member> ar2 = mi.searchGroup(sc, ar);
				if(ar2.size() != 0) {
					mv.view(ar2);
				}else {
					mv.view("검색 실패");

				}
			}else if(select == 5){
				ar.add(ma.addMember(sc));
			}else if(select == 6){
				ma.backUp(ar);
			}else {
				mv.view("종료합니다");
				sc.close();
				break;
			}
		}
	}

}
