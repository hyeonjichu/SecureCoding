package main;

import mycls.MyClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass cls = new MyClass();
		//cls.number = 1; => 접근 안됨
		cls.name = "홍길동";
		//cls.height = 125.34;
		cls.setNumber(123);
		
		int n = cls.getNumber();
		System.out.println(n);
	}

}
