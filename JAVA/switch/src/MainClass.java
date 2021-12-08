
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	switch: if와 비슷하다.
		 			값이 명확해야 한다.
		 			=> 범위를 지정할 수 없음
		 			
		 	형식 : 
		 		switch(대상이 되는 변수){
		 			case 값1:
		 				처리1
		 				break;
		 			case 값2:
		 				처리2
		 				break;
		 			default:
		 				마지막 처리
		 				break;
		 		}
		 */
		
		int num = 2;
		switch(num) {
			case 1:
				System.out.println("num = 1");
				break;
			case 2:
				System.out.println("num = 2");
				break;
			case 3:
				System.out.println("num = 3");
				break;
			default:
				System.out.println("num은 1, 2 아님");
				break;
		}
		
		
	}

}
