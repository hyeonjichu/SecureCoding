
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		자료형 변환
		1. 자동 형 변환
		2. 강제 형 변환 => Cast(큰 크기를 작은 크기로 변환)
		*/
		
		short sh = 12345;	//2byte
		int num;	//4byte
		
		num = sh;	//자동 형 변환
		System.out.println(num);
		
		num = 23456;
		sh = (short)num;	//강제 형 변환
		System.out.println(sh);
		
		long l = 123456789L;	//8byte
		float f;	//4byte
		
		f = l;
		System.out.println(f);
		
		double d = 1.23e3;
		/*
		 1.23e3 => e3 == 10의 3제곱(1000)  --> 1.23 * 1000
		 */
		System.out.println(d);
		
		d = 2.34e-2;
		/*
		 * 2.34e-2 => e-2 == 10의 -2제곱(1/100)  --> 2.34 * 0.01
		 */
		System.out.println(d);
		
		int number1, number2;
		float fnum;
		
		number1 = 3;
		number2 = 2;
		
		fnum = (float)number1 / number2;
		System.out.println(fnum);
		
		
	}

}
