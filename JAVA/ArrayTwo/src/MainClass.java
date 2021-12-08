import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	2차원 배열
			 	int array[][] = new int[3][4];
			 	int []array[] = new int[3][4];
			 	int [][]array = new int[3][4];
		 	
		 		int array[][] = {
		 			{1, 2, 3, 4},
		 			{5, 6, 7, 8},
		 			{9, 10, 11, 12}
		 		};
		 */
		
		int array2[][] = new int[3][4];
		//int array2[][] = new int[3][]; => 뒤는 생략해도 에러 안 남
		array2[0][0] = 1;
		array2[0][1] = 2;
		array2[0][2] = 3;
		array2[0][3] = 4;
		
		array2[1][0] = 5;
		array2[1][1] = 6;
		array2[1][2] = 7;
		array2[1][3] = 8;
		
		array2[2][0] = 9;
		array2[2][1] = 10;
		array2[2][2] = 11;
		array2[2][3] = 12;
		
		System.out.println(Arrays.toString(array2[0]));
		System.out.println(Arrays.toString(array2[1]));
		System.out.println(Arrays.toString(array2[2]));
		
		int array23[][] = {
				{1, 2},
				{3, 4},
				{5, 6}
		};
		System.out.println(array23[1][0]);
		System.out.println(array23.length);
		System.out.println(array23[0].length);
	}

}
