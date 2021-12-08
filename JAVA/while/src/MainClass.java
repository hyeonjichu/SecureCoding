
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int w;
		w = 0;
		while(w<10) {
			System.out.println(w);
			w++;
		}
		
		int i;
		i=0;
		for(; i<10; ) {
			System.out.println("for loop"+i);
			i++;
		}
		
		int dw;
		dw = 0;
		do {
			System.out.println("dw"+dw);
			dw++;
		}while(dw < 10);
		
		//2중 while 구구단
		int num1, num2;
		num1 = 1;
		
		while(num1<10) {
			num2 = 1;
			while(num2<10) {
				System.out.println(num1 +"x"+num2+"="+num1*num2);
				num2++;
			}
			System.out.println();
			num1++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
