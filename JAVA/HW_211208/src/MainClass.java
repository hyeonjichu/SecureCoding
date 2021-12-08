import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int students;
		System.out.print("학생 수를 입력하세요.");
		students = scan.nextInt();
		
		int grade[] = new int[students];
		int sum = 0;
		int avg = 0;
		int cnt = 0;
		int max = 0;
		
		for(int i=0; i<students; i++) {
			System.out.println((i+1)+"번째 학생의 성적을 입력하세요.");
			grade[i] = scan.nextInt();
			sum += grade[i];
			if(max < grade[i]) {
				max = grade[i];
			}
			if(grade[i] >= 90) {
				cnt += 1;
			}
		}
		avg = sum / students;
		
		System.out.println("총 점수는 "+sum+"점 이고, 최고 점수는 "+max+", 평균은 "+avg+"입니다.");
		System.out.println("90점이 넘는 학생은 "+cnt+"명 입니다.");
		
		int newGrade[] = new int[cnt];
		int j = 0;
		for(int i=0; i<students; i++) {
			if(grade[i] >= 90) {
				newGrade[j] = grade[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(newGrade));
		
		
		
		
		/*
		int numArr[] = new int[5];
		System.out.println("양수 5개를 입력하세요.");
		int i = 0;
		while(true) {
			int num = scan.nextInt();
			if(num < 0) {
				System.out.println("양수를 입력하세요.");
				continue;
			}
			else if(i < 5) {
				numArr[i] = num;
				i++;
			}
			if(i == 5) {
				break;
			}
		}
		System.out.println(Arrays.toString(numArr));
		*/
		
		
		int inputNum[] = new int[5];
		int w = 0;
		
		while(w < 5) {
			System.out.print((w+1)+"번째 수 =");
			int num = scan.nextInt();
			if(num > 0) {
				inputNum[w] = num;
			}else {
				System.out.println("0 이상의 수를 입력해 주세요.");
				continue;
			}
			w++;
		}
		System.out.println(Arrays.toString(inputNum));
	}

}
