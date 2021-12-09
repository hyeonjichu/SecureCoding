import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요. >>");
		String strNum1 = "";
		while(true) {
			strNum1 = scan.next();
			boolean chk = true;
			for(int i=0; i<strNum1.length(); i++) {
				int n = (int)strNum1.charAt(i);
				if(n < 48 || n > 57) {
					chk = false;
					break;
				}
			}
			if(chk) {
				break;
			}
			System.out.println("숫자를 입력하세요.");
		}
		
		// 연산자 + - * /
		String oper;
		while(true) {
			System.out.print("연산(+, -, *, /) = ");
			oper = scan.next();
			if(oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/")) {
				break;
			}
			System.out.println("연산자를 정확히 입력해 주십시오");
		}
		
		System.out.println("두 번째 숫자를 입력하세요. >>");
		String strNum2 = "";
		while(true) {
			strNum2 = scan.next();
			boolean chk = true;
			for(int i=0; i<strNum2.length(); i++) {
				int n = (int)strNum2.charAt(i);
				if(n < 48 || n > 57) {
					chk = false;
					break;
				}
			}
			if(chk == false) {
				System.out.println("숫자를 입력하세요.");
				continue;
			}
			break;
		}
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result=0;
		
		switch(oper) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			default:
				System.out.println("연산자를 잘못 입력하셨습니다.");
		}
		
		System.out.println("연산 결과 = "+ result);
	}
}
