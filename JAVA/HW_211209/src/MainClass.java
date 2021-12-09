import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		char c = 'A';
		int ch = c;
//		String c = "A";
//		int ch = c.charAt(0);		//아스키 코드 변경
		if(ch>= 48 && ch <= 57) {
			System.out.println("숫자입니다.");
		}
		else {
			System.out.println("숫자가 아닙니다.");
		}
		
		
		System.out.println("number= ");
		String str = scan.next();
		boolean chk = true;
		
		for(int i=0; i<str.length(); i++) {
			int s = str.charAt(i);
			if(s < 48 || s > 57) {
				chk = false;
				break;
			}
		}
		if(chk) {
			System.out.println("숫자로 이루어져 있습니다.");
		}else {
			System.out.println("숫자로 이루어져 있지 않습니다.");
		}
		
		
		System.out.println("string = ");
		String string = scan.next();
		for(int i=0; i<string.length(); i++) {
			int st = string.charAt(i);
			if(st >= 97 && st <= 122) {
				st -= 32;
			}
			System.out.print((char)st);
		}
		
	}
}
