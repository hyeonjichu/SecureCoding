package main;

import cls.ChildClass;
import cls.ParentClass;

public class MainClass {

	public static void main(String[] args) {

		ChildClass cc = new ChildClass();
		
		cc.parentMethod();
		cc.childMethod();
		
		//cc.name = "일지매";	//protected => 외부 접근 불가능
		
		ParentClass pc = new ParentClass();
		pc.parentMethod();
		//pc.childMethod();  => 안됨
	}

}
