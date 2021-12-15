package cls;

public class ClassTest_2 extends ClassTest_1{

	private String department;
	
	public ClassTest_2() {	}
	
	public ClassTest_2(String name, int salary, String department) { 
		super(name, salary);
		this.department = department;
	}
	
	public void getInformation() { 
//		String name = getName();
//		int salary = getSalary();
//		System.out.println("이름:" + name + " 연봉:" + salary + " 부서:"+department); 
		super.getInformation();
		System.out.println(" 부서:"+department);
	}
	
	public void prn() { 
		System.out.println("서브클래스"); 
	}
	public void callSuperThis() {
		super.prn();
		prn();
	}
}
