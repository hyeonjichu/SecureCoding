package cls;

public class MovieWork extends Movie{
	
	private int num1;
	private int num2;
	private int num3;

	public MovieWork(String title, int director, int acter, int num1, int num2, int num3) {
		super(title, director, acter);
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	@Override 
	public void display() { //여기를 구현하세요. 
		int total = director + acter + num1 + num2 + num3;
		String result = "";
		
		System.out.printf("영화제목:%s\n", title);
		System.out.printf("감독:%d, 배우:%d, 작품성:%d, 대중성:%d, 대본:%d\n", director, acter, num1, num2, num3);
		System.out.printf("영화총점 :%d\n", total);
		
		if (total >= 15)
			result = "☆☆☆☆☆";
		else if (total >= 12)
			result = "☆☆☆☆";
		else if (total >= 10)
			result = "☆☆☆";
		else
			result = "☆☆";
		
		System.out.println("영화평점 : " + result);
	}
}
