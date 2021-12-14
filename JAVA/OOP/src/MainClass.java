
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	object oriented programming
		 	객체		지향
		 	
		 	흐름 -> 절차지향
		 	
		 	1. 은닉성(캡슐화)
		 	2. 상속성
		 	3. 다형성
		 	
		 */
		//class, array -> allocation(동적할당) -> heap
		MyClass cls = new MyClass();
		cls.number = 1;
		cls.name = "홍길동";
		cls.method();
		
		MyClass cls1 = new MyClass();
		cls1.number = 2;
		cls1.name = "성춘향";
		cls1.method();
		
		boolean isPowerOn;
		int channel;
		int volume;
		
		isPowerOn = true;
		channel = 23;
		volume = 10;
		
		System.out.println("tv="+isPowerOn+channel+volume);
		
		TV t = new TV();
		t.isPowerOn = false;
		t.channel = 33;
		t.volume = 9;
		t.method();
	}
}

class TV{
	boolean isPowerOn;
	int channel;
	int volume;
	
	void method() {
		System.out.println("tv="+isPowerOn+channel+volume);
	}
}

class MyClass{
	int number;
	String name;
	
	void method() {
		System.out.println("MyClass method()");
	}
}