
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	continue: skip(생략)
		 	loop 문과 같이 사용한다.
		 	while(조건문){
		 		처리 1
		 		처리 2
		 		
		 		if(조건){
		 			continue; =>처리 3 이 실행 안됨
		 		}
		 		처리 3
		 	}
		 */
		
		for(int i=0; i<5; i++) {
			System.out.println("i="+i);
			System.out.println("for start");
			if(i>3) {
				continue;
			}
			System.out.println("for end");
		}
		
		/*
		//무한 루프가 만들어짐 => continue가 있어서 w++;가 실행되지 않음
		int w = 0;
		while(w<10) {
			System.out.println("w="+w);
			System.out.println("while start");
			if(w>3) {
				continue;
			}
			System.out.println("while end");
			w++;
		}*/
		
		
	}

}
