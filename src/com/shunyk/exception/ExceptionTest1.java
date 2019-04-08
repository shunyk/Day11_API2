package com.shunyk.exception;

import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// Error, Exception;
		// Error : 컴파일 시 발생하는 에러
		// Exception : 실행 중 발생하는 에러
		// 예외처리
		// 목적 : 비정상적인 종료를 막고 정상적으로 프로그램을 진행
		// 방법 : 
		// 1. try{
		//		예외가 발생할만한 코드
		// 	  }catch(발생할 Exception 타입의 매개변수){
		// 		예외 발생시 실행
		//	  }finally{
		//		예외가 발생하든 안하든 실행
		//	  };

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 하나 입력");
		int num = 0;
		int a = 10;
		int result = 0;
		try{
			num = sc.nextInt();
			result = a/num;
			//throw new ArithmeticException();
			int [] ar = new int [3];
			System.out.println(ar[result]);
		}catch (Exception e) {
			//개발시에는 예외 메시지 확인
			e.printStackTrace();
			//배포시에는 변경↓
			System.out.println("예외발생");
		}

		System.out.println(a+num);
		System.out.println("종료");
	}

}
