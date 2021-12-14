package dao;

import java.util.Scanner;

import dto.StudentDto;

//데이터의 접근, 관리
public class StudentDao {
	Scanner sc = new Scanner(System.in);

	private StudentDto student[] = new StudentDto[20];
	private int count;
	
	public StudentDao() {
		count = 0;
		
		student[0] = new StudentDto(1001, "홍길동", 171.1, 90, 95);
		student[1] = new StudentDto(1002, "성춘향", 161.6, 86, 100);
		student[2] = new StudentDto(1003, "일지매", 182.1, 95, 90);
		
		count = 3;
	}
	
	//CRUD
	public void insert() {
		System.out.println("번호 = ");
		int number = sc.nextInt();
		
		System.out.println("이름 = ");
		String name = sc.next();
		
		System.out.println("신장 = ");
		double height = sc.nextDouble();
		
		System.out.println("영어 = ");
		int eng = sc.nextInt();
		
		System.out.println("수학 = ");
		int math = sc.nextInt();
		
		student[count] = new StudentDto(number, name, height, eng, math);
		count++;
		
	}
	public void delete(String name) {
		for(int i=0; i<student.length; i++) {
			if(student[i].getName().equals(name)) {
				student[i] = new StudentDto(0, "", 0, 0, 0);
				break;
			}
		}
	}
	public void select() {
		System.out.println("검색할 학생명 = ");
		String name = sc.next();
		int index = -1;
		for(int i=0; i<student.length; i++) {
			StudentDto dto = student[i];
			if(dto != null && !dto.getName().equals("")) {
				if(dto.getName().equals(name)) {
					index = i;
					break;
				}
			}
		}
		if(index == -1) {
			System.out.println("학생을 찾을 수 없습니다.");
		}else{
			StudentDto dto = student[index];
			System.out.println(dto.toString());
		}
	}
	public void update(String name) {
		int index = -1;
		for(int i=0; i<student.length; i++) {
			if(student[i].getName().equals(name)) {
				index = i;
				break;
			}
		}
		System.out.println("변경할 정보를 입력해주세요. 1. 번호 2. 신장 3. 영어 4. 수학");
		int num = sc.nextInt();
		System.out.println("정보를 입력하세요.");
		switch(num) {
		case 1:
			int info = sc.nextInt();
			student[index].setNumber(info);
			break;
		case 2:
			double dinfo = sc.nextDouble();
			student[index].setHeight(dinfo);
			break;
		case 3:
			info = sc.nextInt();
			student[index].setEng(info);
			break;
		case 4:
			info = sc.nextInt();
			student[index].setMath(info);
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
	}
	public void alldata() {
		for(int i=0; i<student.length; i++) {
			if(student[i] != null) {
				System.out.println(student[i].toString());
			}
		}
	}
}
