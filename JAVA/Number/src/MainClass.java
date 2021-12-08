
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			숫자(상수) : 지정한 숫자.	0 ~ 10 
					2 진수 : 0, 1
					8 진수 : 0 ~ 7 8 -> 10		011 -> 9(10진수)
					10 진수 : 0 ~ 9
					16 진수 : 0 ~ 9 A B C D E F(15)  0xF -> 15(10진수)
			
			변수(공간) : 그릇(크기는 다양). == variable  
					1. 변수를 선언. 변수명을 작명
					2. 자료형 지정.
					
					문자, 숫자, 문자열, 논리값		
					
					자료형지정 변수명;	변수의 선언		<- 그릇을 준비
					변수명 = 값;		변수의 값의 대입	<- 그릇에 내용물을 넣는다
		*/
		
		// 정수 == integer
		int number;
		number = 123;
		
		System.out.println(number);	// 출력
		
		// 변수의 작명 규칙
		int a;
		int A;
		
		// 예약어는 사용할 수 없다 -> 프로그램에서 설정되어 있는 단어
		// int int;
		// int 2a;
		// int 123;
		int num123;
		// int +number;
		// int -number;
		// int *number;
		// int /number;
		// int =number;
		int _number;	// 최근에는 잘 사용하지 않는다
		
		int number_position_char;
		int numberpositionchar;
		int numberPositionChar;
		int numPosChar;
		int iNumPosChar;
		
		int 숫자1;
		숫자1 = 333;
		System.out.println(숫자1);
		
		// 흔한 명칭은 사용을 피하는게 좋다
		// length, object, size
		
		
		// 변수의 자료형의 종류
		
		// 숫자 자료형
		// 정수
		// byte, short, int, long
		byte by;	// 1 byte == 8 bit 0000 0000 -> 1111 1111 -> 256개  0 ~ 255
					//				   맨앞에 있는 bit는 부호 0 -> +,  1 -> -
					//				   -128 ~ 127
		by = -128;
		
		short sh;	// 2 byte		
		sh = 12345;
		
		int i;		// 4 byte	<-----------
		i = 232321334;
		
		long l;		// 8 byte		
		l = 234234423132324L;
		
		// 실수
		// float, double
		float f;	// 4 byte
		f = 123.45678F;
		
		double d;	// 8 byte	<------------
		d = 12.3456789;
		
		
		// 문자(열) 자료형
		// 문자
		char c;		// 2 byte  character	ASCII(아스키) < UNIcode < MULTIbyte	
		c = 'A';
		c = 'b';	// JavaScript var c = 'hello';
		c = '+';
		c = '한';
		c = ' ';
	//	c = '하나';
		
		// 문자열		hello  nice to meet you
		String str;	// wrapper class
		str = "Hello";
		str = "nice to meet you";
		
		System.out.println(str);
		
		// 논리형 true/false
		boolean b;	// true(1)/false(0)
		b = true;
		System.out.println(b);
		
		
	}

}




