import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	String : Wrapper Class
		 			char[]
		 			문자열을 편집, 정보취득 등등
		 */
		String str;
		str = "안녕하세요.";

		String str1 = new String("안녕하세요.");
		String str2 = "반갑습니다.";
		String str3 = str1 + str2;
		System.out.println(str3);
		str3 = str3 +"건강하세요.";
		System.out.println(str3);
		
		//equals: 문자열을 비교
		String str4 = "world";
		String str5 = "worl";
		str5 += "d";
		
		if(str4 == str5) {
			System.out.println("같은 문자열 입니다.");
		}
		if(str4.equals(str5)) {
			System.out.println("같은 문자열 입니다.");
		}
		
		//indexOf: 문자의 위치를 돌려준다.
		//lastIndexOf
		String str6 = "hello World";
		int index = str6.indexOf("l");
		System.out.println(index);
		
		int lastIdx = str6.lastIndexOf("l");
		System.out.println(lastIdx);
		
		//length: 문자열의 길이
		int len = str6.length();
		System.out.println(len);
		
		//replace: 수정
		String str7 = "A*B*C*D";
		String repStr = str7.replace("*", "");
		System.out.println(repStr);
		
		//split: 문자열 자르기 => 배열로 받아야 함
		String str8 = "홍길동-24-2001/05/14-서울시";
		String[] spStr = str8.split("-");
		System.out.println(Arrays.toString(spStr));
		
		//substring 문자열을 범위로 자른다.
		String str9 = "안녕 반가워요 건강해요";
		String substr = str9.substring(3,7);
		System.out.println(substr);
		
		//toUpperCase : 모두 대문자
		String str10 = "abcDEF";
		String upStr = str10.toUpperCase();
		System.out.println(upStr);
		
		//toLowerCase : 모두 소문자
		String lowStr = str10.toLowerCase();
		System.out.println(lowStr);
		
		//trim : 문자열의 앞, 뒤 공백을 제거
		String str11 = "    java java   java        ";
		String tStr = str11.trim();
		System.out.println(tStr);
		
		//charAt : idx값을 넣으면 해당 스펠링이 나옴
		//=>char로 받아야 함
		String str12 = "가나다라마";
		char chAt = str12.charAt(2);
		System.out.println(chAt);
		
		//contains: 포함 여부 조사
		String str13 = "서울시 마포구 서교동";
		boolean chk = str13.contains("마포");
		System.out.println(chk);
		
		
		
		
		
		
		
		
		
		
	}
}
