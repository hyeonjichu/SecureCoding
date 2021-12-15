package main;

public class MyClass {

	private int number;
	private String name;
	
	public MyClass() {	//기본 생성자
		
		this(0, "s");	//=>this는 항상 맨 위에 들어와야 함
		//아래 MyClass와 this를 함께 쓰면 무한루프 돌 수 있음 주의하기
		
		System.out.println("MyClass MyClass()");
	}

	public MyClass(int number, String name) {
		//this();
		
		this.number = number;
		this.name = name;
		System.out.println("MyClass MyClass(int number, String name)");
	}
	
}
