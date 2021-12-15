package cls;

public class ChildClass extends ParentClass{

	private double height;
	
	public void childMethod() {
		System.out.println("ChildClass childMethod");
		
		setNumber(1);
		
		name = "홍길동"; 	//protected로 되어 있어서 바로 접근 가능
	}
}
