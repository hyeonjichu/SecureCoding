
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	if : 조건문
		 	형식 : 	if(조건){
		 	 			처리
		 			};
		 	조건 : ==, >, <, >=, <=, !=
		 	다수의 조건 : 논리 연산자와 같이 사용
		 				&&, ||, !
		 */
		
		int num = 5;
		if(num > 0) {
			System.out.println("num은 0보다 큽니다.");
		}
		
		if(num == 5){
			System.out.println("num은 5입니다.");
		}
		
		if(num >= 5) {
			System.out.println("num은 5보다 크거나 같습니다.");
		}
		
		boolean b = true;
		
		if(b == true) {
			System.out.println("b는 true입니다.");
		}
		
		b = false;
		if(b == false) {
			System.out.println("b는 false입니다.");
		}
		if(!b) {
			System.out.println("b는 false입니다.");
		}
		
		if(num > 0 && num <= 10) {
			System.out.println("num은 0보다 크고 10보다 작거나 같습니다.");
		}
		/*
		삼항 연산자
		값 = (조건) ? 값1 : 값2
		*/
		
		int number = 69;
		
		if(number >= 70) {
			System.out.println("통과입니다.");
		}else {
			System.out.println("재시험입니다.");
		}
		
		String result = (number >= 70) ? "통과입니다. ":"재시험입니다.";
		System.out.println(result);
		
		int result2 = (number > 60) ? 10 : 5;
		System.out.println(result2);
		
		int n = 90;
		if(n == 100) {
			System.out.println("A+입니다.");
		}else if(n >= 90){
			System.out.println("A입니다.");
		}else if(n >= 80) {
			System.out.println("B입니다.");
		}else if(n >= 70) {
			System.out.println("C입니다.");
		}else {
			System.out.println("재시험입니다.");
		}
		
		String str1 = "안녕하세요";
		String str2 = "안녕";
		str2 += "하세요";
		if(str1 == str2) {
			System.out.println("같은 문자입니다.");
		}else {
			System.out.println("다른 문자입니다.");
		}
		
		//equals사용해야함
		if(str1.equals(str2)) {
			System.out.println("같은 문자 입니다. equals사용");
		}
		
		
		
		
		
	}
}
