import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ascToChar(65));
		
		int d[] = division(10, 3);
		System.out.println("10 나누기 3의 몫은 "+d[0]+"이고, 나머지는 "+d[1]+"이다.");
		
		double r = distance(2,2,4,4);
		System.out.println(r);
		
		boolean chk = isDouble("3.4555");
		System.out.println(chk);
		boolean chk2 = isDouble("34555");
		System.out.println(chk2);
		
		int resultArr[];
		int array2[][] = {
				{1,2,3,4},
				{5,6,7}
		};
		resultArr = array2ToArray(array2);
		System.out.println(Arrays.toString(resultArr));
	}

	// 아스키 코드 값을 입력하면 문자를 확인할 수 있는 함수를 작성하라.
	static char ascToChar(int asc) {
		
		return (char)asc;
	}
	
	// 두수의 나눗셈을 하는 함수를 작성하라. 하나의 함수에서 몫과 나머지를 구한다.
	static int[] division(int d, int n) {
		if(n == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return new int[] {-1};
		}
		int result = d / n;
		int r = d % n;
		//System.out.println(d+"나누기"+n+"의 몫은 "+result+"이고, 나머지는 "+r+"이다.");
		return new int[] {result, r};
	}
	
	// 두수의 나눗셈을 하는 함수를 작성하라. 하나의 함수에서 몫과 나머지를 구한다.
	static int div(int n1, int n2, int[] tag) {
		int r = n1/ n2;
		tag[0] = n1 % n2;
		return r;
	}

	// 두점 사이의 거리를 구하는 함수를 작성하라. 
	static double distance(double x1, double y1, double x2, double y2) {
		double result;
		result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		return result;
	}
	
	// 입력된 숫자가 정수인지 실수인지 확인할 수 있는 함수를 작성하라.
	static boolean isDouble(String snumber) {
//		boolean chk = snumber.contains(".");
//		return chk;
		boolean b = false;
		for(int i=0; i<snumber.length(); i++) {
			char c = snumber.charAt(i);
			if(c == '.') {
				b = true;
				break;
			}
		}
		return b;
	}
	
	//2차원 배열을 1차원 배열로 변경해서 리턴하는 함수를 작성하라.
	static int[] array2ToArray(int array[][]) {
		int cnt = 0;
		for(int i=0; i<array.length; i++) {
			cnt += array[i].length;
		}
		int result[] = new int[cnt];
		cnt = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				result[cnt] = array[i][j];
				cnt++;
			}
		}
		
		return result;
	}

}
