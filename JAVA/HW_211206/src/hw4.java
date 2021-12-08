import java.util.Scanner;

public class hw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String name;
		System.out.println("name = ");
		name = scan.next();
		
		int age;
		System.out.println("age=");
		age = scan.nextInt();
		
		boolean man;
		System.out.println("man= ");
		man = scan.nextBoolean();
		
		String phone;
		System.out.println("phone=");
		phone = scan.next();
		
		double height;
		System.out.println("height=");
		height = scan.nextDouble();
		
		String address;
		System.out.println("address=");
		address = scan.next();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(man);
		System.out.println(phone);
		System.out.println(height);
		System.out.println(address);
		
	}

}
