import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	function : 함수, 독립적
		 	method : class에 소속된 함수
		 	
		 	형식:
		 						parameter, getter
		 	돌아오는 값의 자료형 함수명(들어가는 값의 자료형, 들어가는 값의 자료형){
		 		처리
				return 값;
		 	}
		 	
		 	void -> 자료형이 없음
		 */

		int i = functionName('A');
		System.out.println("i= "+i);
		
		String chk = toUpperCase("hello");
		System.out.println(chk);
		
		functionName3(40, 8);
		
		int array[] = {11, 22, 33};
		int arrAlias[];		//배열 복사
		arrAlias = array; 
		arrAlias[1] = 27;	//array도 같이 바뀜
		
		//주소 같음
		System.out.println(arrAlias);
		System.out.println(array);
		
		int arrayNum[] = {1, 2, 3, 4, 5};	//값 변하지 않음
		functionName4(arrayNum[0], arrayNum[1], arrayNum[2], arrayNum[3], arrayNum[4]);
		System.out.println(Arrays.toString(arrayNum));
		
		functionName5(arrayNum);	//값 변화
		System.out.println(Arrays.toString(arrayNum));
		System.out.println("array"+arrayNum);	//함수에 주소를 할당한다. => 함수 내부에서 받은 배열과 주소 같음
		
		int arr[] = functionName6(arrayNum);
		System.out.println(Arrays.toString(arr));
	}
	
	static int functionName(char c) {
		System.out.println("functionName 호출, char c="+c);
		
		return 23;
	}
	
	static void functionName2() {
		System.out.println("functionName2 호출");
	}
	
	
	static void functionName3(double d, int n) {
		double result;
		
		if(n == 0) {
			System.out.println("계산할 수 없습니다.");
			return;
		}
		
		result = d / n;
		System.out.println("결과값: "+result);
	}
	
	//value 값을 할당
	static void functionName4(int a1, int a2, int a3, int a4, int a5) {
		a1 *= 2;
		a2 *= 2;
		a3 *= 2;
		a4 *= 2;
		a5 *= 2;
	}
	
	//주소를 할당
	static void functionName5(int array[]) {
		System.out.println("array"+array);
		for(int i=0; i<array.length; i++) {
			array[i] *= 2;
		}
	}
	
	static int[] functionName6(int array[]) {
		for(int i=0; i<array.length; i++) {
			array[i] *= 2;
		}
		
		return array;	//=>배열이면 굳이 return 값이 필요하지 않음, 어차피 주소 값으로 할당되기 때문에 자동 변환됨
	}
	
	static String toUpperCase(String str) {
		String s = "";
		for(int i=0; i<str.length(); i++) {
			int n = str.charAt(i);
			if(n >= 97) {
				n -= 32;
			}
			s += (char) n;
		}
		return s;
	}
}
