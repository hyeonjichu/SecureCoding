import java.util.Scanner;

public class hw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int x, y;
		x = scan.nextInt();
		y = scan.nextInt();
		
		int tmp;
		tmp = x;
		x = y;
		y = tmp;
		System.out.println("x=" + x+ ",y="+ y);
	}

}
