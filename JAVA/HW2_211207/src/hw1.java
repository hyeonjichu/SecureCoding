import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요. >>");
		String strNum1 = "";
		while(true) {
			strNum1 = scan.next();
			if(chk(strNum1)) {
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
			if(chk(strNum2)) {
				break;
			}
			System.out.println("숫자를 입력하세요.");
		}
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		System.out.println("연산 결과 = "+ calc(num1, oper, num2));
	}
	
	static boolean chk(String str) {
		boolean chk = true;
		for(int i=0; i<str.length(); i++) {
			int n = (int)str.charAt(i);
			if(n < 48 || n > 57) {
				chk = false;
				break;
			}
		}
		return chk;
	}
	
	static int calc(int n1, String oper,int n2) {
		int result = 0;
		switch(oper) {
			case "+":
				result = n1 + n2;
				break;
			case "-":
				result = n1 - n2;
				break;
			case "*":
				result = n1 * n2;
				break;
			case "/":
				result = n1 / n2;
				break;
		}
		return result;
	}
}
