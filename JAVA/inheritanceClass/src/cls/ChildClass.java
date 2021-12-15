package cls;

public class ChildClass extends ParentClass {

	private double height;
	
	public ChildClass() {
		//this(123.4);
		super(123, "hi");	//부모 클래스의 기본 생성자가 없을 경우 생성자를 알려주는 경우
		System.out.println("ChildClass ChildClass()");
	}

	public ChildClass(double height) {
		//super(128, "hello");
		this.height = height;
	}
	
	public ChildClass(int number, String name, double height) {
		super(number, name);	//super을 맨 위에 적어야 함 this()와 함께 사용 불가능
		this.height = height;
	}
	
	
}
