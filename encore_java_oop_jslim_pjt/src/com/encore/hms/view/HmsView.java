package com.encore.hms.view;

import java.util.Scanner;

public class HmsView {
	
	public static Scanner scan = new Scanner(System.in) ;  
	
	public HmsView() {
	}
	
	public void mainMenu() {
		System.out.println(">>>> HMS Ver1.0 <<<"); 
		System.out.println("1.  전체출력");
		System.out.println("2.  이름으로 검색");
		System.out.println("3.  이름으로 찾아서 수정");
		System.out.println("4.  이름으로 찾아서 삭제");
		System.out.println("5.  생성");
		System.out.println("99. 종료");
		System.out.print("Input Number : "); 
		int number = scan.nextInt() ; 
		switch(number) {
			case  1 : 
				perPrint();
				break;
			case 5 : 
				subMenu();
				break;
			case 99 : 
				System.out.println("프로그램을 종료하고 데이터는 보관되지 않습니다.") ; 
				System.exit(0) ; 
		} // switch end block 
	} // main menu end block 
	
	public void perPrint() {
		
	}
	public void subMenu() {
		System.out.println();
		System.out.println(">>> 객체 생성을 위한 Sub Menu <<<");
		System.out.println("1.  학생");
		System.out.println("2.  강사");
		System.out.println("3.  직원");
		System.out.println("99. 상위메뉴 이동");
		System.out.print("Input Number : "); 
		int number = scan.nextInt() ; 
		switch(number) {
			case 1 : 
			case 2 : 
			case 3 :
				makePerson(number); 
			case 99 : 
				return ; 
		} // switch end block 
	}
	
	public void makePerson(int number) {
		
	}
}




