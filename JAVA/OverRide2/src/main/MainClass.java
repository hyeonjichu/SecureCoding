package main;

import cls.ChildOneClass;
import cls.ParentClass;

public class MainClass {

	public static void main(String[] args) {
		//ChildOneClass child = new ChildOneClass();
		//child.Method();
		
		ParentClass pc = new ChildOneClass();
		pc.Method();
		
		ChildOneClass coc = (ChildOneClass)pc;	//강제 변환
		coc.function();
		
//		ParentClass pc = new ChildOndClass();
//		ParentClass의 주소를 가진 pc를 ChildOndClass를 담고 있는 인스턴스를 생성한다.
//
//
//		ChildOndClass coc = (ChildOndClass)pc;
//		ParentClass의 주소를 가진 pc를 ChildOndClass의 주소를 가진 coc로 주소를 강제 변환시킨다.

	}

}
