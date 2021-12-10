import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 개의 숫자를 정렬하시겠습니까?");
		int num = scan.nextInt();
		
		int number[] = new int[num];
		System.out.println("숫자들을 입력해주세요.");
		for(int i=0; i<num; i++) {
			System.out.println((i+1)+"번째 숫자=");
			number[i] = scan.nextInt();
		}
		
		while(true){
			System.out.println("1. 오름차순 2. 내림차순");
			int menu = scan.nextInt();
			if(menu == 1) {
				int tmp;
				for(int i=0; i<number.length-1; i++) {
					for(int j=i+1; j<number.length; j++) {
						if(number[i] > number[j]) {
							swap(number, i, j);
						}
					}
				}
				break;
			}else if(menu == 2) {
				int tmp;
				for(int i=0; i<number.length-1; i++) {
					for(int j=i+1; j<number.length; j++) {
						if(number[i] < number[j]) {
							swap(number, i, j);
						}
					}
				}
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
		System.out.println(Arrays.toString(number));
	}
	
	static void swap(int array[], int i, int j) {
		int tmp;
		tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
				
	}
	
}
