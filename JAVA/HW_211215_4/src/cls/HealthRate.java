package cls;

public class HealthRate extends Health {

	public HealthRate(String name, double height, double weight) {
		super(name, height, weight);
	}
	
	public void prn() {
		double sw = (height - 100) * 0.9;
		double b = (weight - sw)/sw*100;
		String chk = "";
		if(b < 10) {
			chk = "정상";
		}else if(b >= 10 && b < 20) {
			chk = "과체중";
		}else if(b >= 20) {
			chk = "비만";
		}
		System.out.printf("%s님의 키 %.0f , 몸무게 %.0f %s입니다.\n", name, height, weight, chk);
	}
	
}
