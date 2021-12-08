
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	Operator : 연산자
		 	+, -, *, /, %
		 	++ increment
		 	-- decrement
		 */
		int num1, num2;
		int result;
		
		num1 = 23;
		num2 = 7;
		
		result = num1 + num2;
		System.out.println(result);
		
		result = num1 - num2;
		System.out.println(result);
		
		result = num1 * num2;
		System.out.println(result);
		
		result = num1 / num2;	//Arithmetic: 산수, 연산 => 분모에 0이 오지 않도록 주의
		System.out.println(result);
		
		result = num1 % num2;
		System.out.println(result);

		num1 = 0;
		//자기 자신을 갱신
		num1 = num1 + 1;
		num1 += 1;
		num1++;
		System.out.println(num1);
		
		int n1, n2;
		
		n1 = 0;
		n2 = 0;
		
		n2 = n1++;
		System.out.println("n2="+n2+",n1="+n1);
		
		n2 = ++n1;
		System.out.println("n2="+n2+",n1="+n1);
		
		
		
	}
}
