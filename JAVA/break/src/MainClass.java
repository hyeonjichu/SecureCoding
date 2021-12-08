import java.util.Iterator;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	break == 탈출 escape => loop를 멈춤
		 	switch, for, while, do while과 함께 사용
		 	
		 	for(int i = 0; i<100; i++){
		 		if(조건){
		 			break;
		 		}
		 	}
		 	
		 	int w = 0;
		 	while(w < 100){
		 		if(조건({
		 			break;
		 		}
		 		w++;
		 	}
		 	
		 */
		
		for(int i = 0; i < 10; i++) {
			System.out.println("for loop"+i);
			if(i == 5) {
				break;
			}
		}
		
		int array[] = {1, 5, 7, -4, 0, 8, 3, 2};
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
			if(array[i] < 0) {
				break;
			}
		}
		
		
		Scanner scan = new Scanner(System.in);
		int number;
		
		while(true) {
			System.out.print("양수인 숫자를 입력하세요.");
			number = scan.nextInt();
			if(number > 0) {
				break;
			}
		}
		System.out.println("입력한 숫자는 "+number+"입니다.");
		
		
		//2중 for문 탈출
		for(int i=0; i<10; i++) {
			System.out.println("i="+i);
			for(int j=0; j<10; j++) {
				System.out.println("\tj="+j);
				if(i == 5 && j == 3) {
					break;
				}
			}
		}
		
		
		//1. loop문의 개수에 맞게 break를 설정
		boolean b = false;
		
		for(int i=0; i<10; i++) {
			System.out.println("i="+i);
			for(int j=0; j<10; j++) {
				System.out.println("\tj="+j);
				if(i == 5 && j == 3) {
					b = true;
					break;
				}
			}
			if(b) {
				break;
			}
		}
		
		//2. break를 셋팅
		chu_out: for(int i=0; i<10; i++) {
			System.out.println("i="+i);
			for(int j=0; j<10; j++) {
				System.out.println("\tj="+j);
				if(i == 3 && j == 5) {
					break chu_out;
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
