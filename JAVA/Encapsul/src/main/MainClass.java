package main;

import dto.MemberDto;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Member[][] = {
				{"홍길동", "24", "123-4235", "서울시","선배"},
				{"성춘향", "19", "536-4235", "인천시","동창"},
				{"정수동", "22", "123-4235", "남원시","후배"},
		};
		MemberDto member[] = new MemberDto[3];
		
		for(int i=0; i<member.length; i++) {
			member[i] = new MemberDto();
		}
		
		//추가
		member[0].setName("홍길동");
		member[0].setAge(24);
		member[0].setPhone("123-4235");
		member[0].setAddress("서울시");
		member[0].setContent("동창");

		System.out.println(member[0].getName());
		System.out.println(member[0].getAge());
		System.out.println(member[0].getPhone());
		System.out.println(member[0].getAddress());
		System.out.println(member[0].getContent());
	}

}
