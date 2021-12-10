import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

//		학생들의 정보를 2차원배열에 입력을 받는다
//		(이름, 생년월일, 국어, 영어, 수학)
		System.out.println("학생 수를 입력하세요.");
		int num = scan.nextInt();
		String students[][] = new String[num][5];
		for(int i=0; i<num; i++) {
			System.out.println("이름, 생년월일, 국어성적, 영어성적, 수학성적 순으로 입력하세요.");
			for(int j=0; j<5; j++) {
				students[i][j] = scan.next();
			}
		}
		
//		각 학생들의 국어, 영어, 수학을 합친 총점은? 개개인의 총점 

		int max = 0;
		String name ="";
		for(int i=0; i<num; i++) {
			int result = Integer.parseInt(students[i][2]) + Integer.parseInt(students[i][3]) + Integer.parseInt(students[i][4]);
			System.out.println(students[i][0]+"의 총 점은 "+result+"점 입니다.");
			if(max < result) {
				max = result;
				name = students[i][0];
			}
		}
//		학생들의 국어점수의 총점은?
		int kScore = 0;
		for(int i=0; i<num; i++) {
			kScore += Integer.parseInt(students[i][2]);
		}
		System.out.println("국어 점수의 총 점은 "+kScore+"점 입니다.");
//		영어 점수의 최고점수는 몇 점인가?
		max = 0;
		for(int i=0; i<num; i++) {
			if(max < Integer.parseInt(students[i][3])) {
				max = Integer.parseInt(students[i][3]);
			}
		}
		System.out.println("영어 점수의 최고점은 "+max+"점 입니다.");
//		수학점수의 최저점수는 몇 점인가?
		int min = 100;
		for(int i=0; i<num; i++) {
			if(min > Integer.parseInt(students[i][4])) {
				min = Integer.parseInt(students[i][4]);
			}
		}
		System.out.println("수학 점수의 최저점은 "+min+"점 입니다.");
//		학급에서 1등은 누구인가? 이름을 출력하라
		System.out.println("1등 학생은 "+name+"입니다.");

	}

}
