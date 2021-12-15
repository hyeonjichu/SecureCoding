package cls;

public class ChildClass extends ParentClass {

	/*
	 	Over Ride : 부모 클래스에서 상속받은 메소드를 고쳐 기입하는 것
	 	
	 	1. 상속받은 같은 함수(메소드)를 고쳐 작성하여 사용
	 	2. class 관리
	 */
	
	@Override	//namespace -> 주석 -> 없어도 됨
	public void pMethod() {
		//super를 통해 부모 클래스 메소드 접근, 생성자에 접근할 경우에만 제일 위에 위치
		//super.pMethod();
		System.out.println("ChildClass pMethod()");
	}
	public void func() {
		//pMethod();	//childclass의 메소드 호출됨
		super.pMethod();	//부모class의 메소드 호출
	}
}
