package chapter02_01;

public class TestClass03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ch1 = 65; 숫자도 가능한 타입
		char ch1;
		ch1 = 'A'; // 저장할 문자는 ' '로 묶어 써야함
		// ch1 = "A"; " "로 묶으면 error!
		char ch2 = '가'; // 유니코드 44032
		
		char ch3 = 65;
		char ch4 = 44032;
		
		int int1;
		int1 = ch2;
		
		String str1, str2, str3;
		str1 = "이것은 char값에 들어간것을";
		str2 = "int타입을 통해 \" 숫자로 변환한것";
		str3 = "\n오늘은 비가 많이 옵니다,\n내일은 맑으면 좋겠습니다.";
		
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(str1 + "예시 : " + ch2 + "," + int1 + str2);
		System.out.println(str3);
		
		boolean bl1 = true;
		boolean bl2 = false;
		
		System.out.println(bl1);
	}

}
