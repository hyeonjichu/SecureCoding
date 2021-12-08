
public class hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		int age;
		boolean man;
		String phone;
		double height;
		String address;
		
		name="홍길동";
		age = 23;
		man = true;
		phone = "010-1111-2222";
		height=175.6;
		address = "경기도";
		
		System.out.println("==========================================================");
		System.out.println("\\name\tage\tman\tphone\t\theight\taddress\t\\");
		System.out.println("==========================================================");
		System.out.println("\\\"" + name + "\"\t" + age + "\t" + man + "\t" + phone + "\t" + height + "\t\'" + address + "\'\t\\");
		
		name="일지매";
		age = 18;
		man = true;
		phone = "02-1111-2222";
		height=180.01;
		address = "서울";
		System.out.println("\\\"" + name + "\"\t" + age + "\t" + man + "\t" + phone + "\t" + height + "\t\'" + address + "\'\t\\");
		System.out.println("\\\"장옥정\"\t14\tfalse\t02-111-2222\t155.78\t\'서울\'\t\\");
		System.out.println("==========================================================");
	}

}
