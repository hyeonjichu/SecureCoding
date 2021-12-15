package main;

import java.util.Scanner;

import dao.StudentDao;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		StudentDao dao = new StudentDao();
		
		while(true) {
			System.out.println("1. 학생정보 추가");
			System.out.println("2. 학생정보 삭제");
			System.out.println("3. 학생정보 검색");
			System.out.println("4. 학생정보 수정");
			System.out.println("5. 학생정보 모두 출력");
			System.out.println("6. 종료");
			
			System.out.println("메뉴번호 입력 >>");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				dao.insert();
				break;
			case 2:
				dao.delete();
				break;
			case 3:
				dao.select();
				break;
			case 4:
				dao.update();
				break;
			case 5:
				dao.alldata();
				break;
			case 6:
				System.exit(0);
				break;
			}
		}
	}

}
