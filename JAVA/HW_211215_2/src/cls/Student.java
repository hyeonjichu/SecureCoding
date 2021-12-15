package cls;

public class Student extends Human {

	private String number;
	
	public Student() {	}

	public Student(String name, int age, int height, int weight, String number) {
		super(name, age, height, weight);
		this.number = number;
	}
	
	public String toString() {
		//String data = name + "\t" + age + "\t" + height + "\t" + weight + "\t" + number;
		return super.toString() + "\t" + this.number;
	}
	
}
