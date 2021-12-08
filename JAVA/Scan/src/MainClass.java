import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		/*
		int iNumber;
		System.out.println("정수= ");
		iNumber = scan.nextInt();
		System.out.println("입력받은 수 ="+iNumber);
		*/
		/*
		double dNumber;
		System.out.println("실수= ");
		dNumber = scan.nextDouble();
		System.out.println("입력받은 수 ="+dNumber);
		*/
		/*
		boolean b;
		System.out.println("T/F = ");
		b = scan.nextBoolean();
		System.out.println("논리형: "+b);
		*/
		/*
		String str;
		System.out.println("string = ");
		str = scan.next();	//띄어쓰기 안됨
		System.out.println("입력된 문자열: "+str);
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("String=");
		str = br.readLine();
		System.out.println("입력된 문자열: "+str);
		
	}

}
