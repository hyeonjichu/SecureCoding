import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Menu>>");
		System.out.println("1. 10진수 -> 2진수");
		System.out.println("2. 10진수 -> 8진수");
		System.out.println("3. 10진수 -> 16진수");
		System.out.println("4. 2진수 -> 10진수");
		System.out.println("5. 8진수 -> 10진수");
		System.out.println("6. 16진수 -> 10진수");
		System.out.println("원하시는 번호를 눌러주세요. >>");
		int menu = scan.nextInt();
		
		System.out.println("변경하고 싶은 숫자를 입력해 주세요.>>");
		String numStr = scan.next();
		String result;
		int resultInt;
		switch(menu) {
		case 1:
			result = Integer.toBinaryString(Integer.parseInt(numStr));
			System.out.println("10진수 "+numStr+"의 2진수는 "+result+"입니다.");
			break;
		case 2:
			result = Integer.toOctalString(Integer.parseInt(numStr));
			System.out.println("10진수 "+numStr+"의 8진수는 "+result+"입니다.");
			break;
		case 3:
			result = Integer.toHexString(Integer.parseInt(numStr));
			System.out.println("10진수 "+numStr+"의 16진수는 "+result+"입니다.");
			break;
		case 4:
			resultInt = Integer.parseInt(numStr, 2);
			System.out.println("2진수 "+numStr+"의 10진수는 "+resultInt+"입니다.");
			break;
		case 5:
			resultInt = Integer.parseInt(numStr, 8);
			System.out.println("8진수 "+numStr+"의 10진수는 "+resultInt+"입니다.");
			break;
		case 6:
			resultInt = Integer.parseInt(numStr, 16);
			System.out.println("16진수 "+numStr+"의 10진수는 "+resultInt+"입니다.");
			break;
		}
	}

}
