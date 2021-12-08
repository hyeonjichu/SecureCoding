
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		for(n = 0; n < 2; n++) {
			System.out.println(n);
		}
		
		/*
		//endless loop
		for(int i = 0; ;i++) {
			System.out.println(i+" ");
		}*/
		
		//1부터 10까지 합
		int sum = 0;
		for(int i = 0; i<=10; i++) {
			sum += i;
		}
		System.out.println("sum="+sum);

		
		
		String names[] = {"홍길동", "일지매", "성춘향", "홍두께"};
		//성춘향을 찾아라
		for(int i=0; i<names.length; i++) {
			if(names[i].equals("성춘향")){
				System.out.println("찾았습니다");
				System.out.println("번호="+(i+1));
			}
		}
		
		
		
		//학생 5명의 국어 성적의 합계와 평균
		//90, 85, 95, 100, 85
		int numArr[] = {90, 85, 95, 100, 85};
		sum = 0;
		
		for(int i=0; i<5; i++) {
			sum += numArr[i];
		}
		int result = 0;
		result = sum / numArr.length;
		System.out.println("합계 = "+sum+", 평균 = "+result);
		
		//최고 점수를 출력하라
		int max = 0;
		for(int i=0; i<numArr.length; i++) {
			if(max < numArr[i]) {
				max = numArr[i];
			}
		}
		System.out.println("최고 점수는 "+max+"점 입니다.");
		
		
		
		//for each
		for(int num : numArr) {
			System.out.print(num+" ");
		}
		
		//2중 for문
		for(int i=0; i<10; i++) {
			System.out.println("i= "+i);
			for(int j=0; j<5; j++) {
				System.out.println("\tj="+j);
			}
		}
		
		int array2[][] = {
				{11,12,13,14},
				{21,22,23,24},
				{31,32,33,34}
		};
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++) {
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
