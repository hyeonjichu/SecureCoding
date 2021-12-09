
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	Wrapper Class
		 	일반 자료형(char, int, double)을 사용하기 편리하도록 구현해 놓은 것
		 	"문자열"
		 	String -> Wrapper Class
		 	char chArr[] = {'h', 'e', 'l', 'l', 'o'}; 
		 	
		 	일반 자료형				Wrapper class
		 	boolean 			Boolean
		 	
		 	byte				Byte
		 	short				Short
		 	int					Integer   +++
		 	long				Long
		 	
		 	float				Float
		 	double				Double   +++
		 	
		 	char				Character
		 	char[]				String   +++
		 	// => +++ 말고 거의 잘 안 씀
		 	
		 	class == 설계, 구성 + 변수 + 함수(메소드) - 기능
		 	MyClass cls = new MyClass();
		 	var cls = Myclass() => Kotlin
		 	
		 */
		
		int i = 123;
		Integer iobj = 123;
		//Integer iobj = new Integer(123);
		
		System.out.println("i="+i);
		System.out.println("iobj="+iobj);
		
		
		//String str = "hello";
		//String strObj = new String("hello");
		
		// 숫자 -> 문자열
		Integer objNumber = 123;
		String str = objNumber.toString() + 1;
		System.out.println(str);	//문자열이므로 124가 아니라 1231이 나옴
		
		int num = 123;
		String str1 = num + "";		//간단해져서 위처럼 길게 사용하지 않음
		
		double dnum = 123.456;
		String str2 = dnum + "";
		
		//문자열 -> 숫자
		String str3 = "12345";
		int n = Integer.parseInt(str3);
		System.out.println(n+1);
		
		String str4 = "1234.5678";
		double d = Double.parseDouble(str4);
		System.out.println(d);
		
		
		//2진수, 8진수, 10진수, 16진수 변경
		//10진수 -> 2진수
		int num10 = 16;
		String num2 = Integer.toBinaryString(num10);
		//String num2 = Integer.toOctalString(num10);	//8진수
		//String num2 = Integer.toHexString(num10);	//16진수
		System.out.println(num2);
		
		//2진수 -> 10진수
		String number2 = "10101100";
		int number10 = Integer.parseInt(number2, 2);
		System.out.println(number10);
		
		
		//10진수 -> 8진수
		int n10 = 237;
		String n8 = Integer.toOctalString(n10);
		System.out.println(n8);
		
		//8진수 -> 10진수
		n10 = Integer.parseInt(n8, 8);
		System.out.println(n10);
		
		//10진수 -> 16진수
		int nn10 = 497;
		String nn16 = Integer.toHexString(nn10);
		System.out.println(nn16);
		
		//16진수 -> 10진수
		nn10 = Integer.parseInt(nn16, 16);
		System.out.println(nn10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
