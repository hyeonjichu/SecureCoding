import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	Array : 배열. 같은 자료형 변수들의 묶음
		 	목적 -> 변수 관리
		 	형식:
		 		자료형 배열변수면[] = new 자료형[배열의 총 수]
		 		int arrName[] = new int[5];
		 		arrName[0] = 11;
		 		arrName[1] = 22;
		 		arrName[2] = 33;
		 		arrName[3] = 44;
		 		arrName[4] = 55;
		 */
		
		int array[] = new int[5];
//		int []array2 = new int[5];
//		int[] array3 = new int[5];
		
		System.out.println(array);
		System.out.println(array.length);
		
		int num1;
		num1 = 333;
		
		System.out.println(num1);
		System.out.println(array[0]);	//동적할당 => 자동으로 0 담겨져 있음
		
		array[0] = 11;
		array[1] = 22;
		array[2] = 33;
		array[3] = 44;
		array[4] = 55;
		
		System.out.println(Arrays.toString(array));	//array요소 한 번에 출력
		
		//배열 선언 & 초기화
		int Array[] = {111, 222, 333, 444, 555};
		
		System.out.println(Array[1]);
		
		char chArr[] = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(Arrays.toString(chArr));
		System.out.println(chArr);	//println이 문자열로 인식함 => 자동적으로 문자열로 변환되어 출력
		
		char c = 'A';
		System.out.println(c);
		System.out.println((int)c);
		
		
		
		
		
	}

}
