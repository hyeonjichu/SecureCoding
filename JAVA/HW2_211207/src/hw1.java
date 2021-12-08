import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요.");
		int num1 = scan.nextInt();
		
		System.out.println("연산자를 입력하세요.");
		String oper;
		do{
			oper = scan.next();
			System.out.println("연산자를 입력하세요.");
		}while(!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/"));
		
		System.out.println("두 번째 숫자를 입력하세요.");
		int num2 = scan.nextInt();
		
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
