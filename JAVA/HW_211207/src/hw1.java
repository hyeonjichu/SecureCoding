import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int pay;
		int money;
		System.out.println("상품 금액을 입력하세요. ");
		pay = scan.nextInt();
		System.out.println("본인 금액을 입력하세요. ");
		money = scan.nextInt();
		
		System.out.println("상품금액은 "+pay+"원 이고, 지불하신 금액은 "+money+"입니다.");
		int result;
		result = money - pay;
		System.out.println("거스름돈= "+result);
		
		int m5000 = result / 5000;
		result -= 5000 * m5000;
		
		int m1000 = result / 1000;
		result -= 1000 * m1000;
		//int m1000 = result % 5000 / 1000;
		
		int m500 = result / 500;
		result -= 500 * m500;
		//int m500 = result % 1000 / 500;
		
		int m100 = result / 100;
		result -= 100 * m100;
		
		int m50 = result / 50;
		result -= 50 * m50;
		
		int m10 = result / 10;
		result -= 10 * m10;
		
		System.out.println("5000원 "+m5000+"장, 1000원 "+m1000+"장, 500원 "+m500+"개, 100원 "+m100+"개, 50원 "+m50+"개, 10원 "+m10+"개");
	}

}
