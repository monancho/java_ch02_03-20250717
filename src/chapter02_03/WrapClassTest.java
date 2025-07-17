package chapter02_03;

public class WrapClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strValue = "1000000"; // 문자열
		
//		int intValue = (int) str; 문자열은 숫자로 강제 형변환 casting이 안됨
		int intValue = Integer.parseInt(strValue); // 문자열 숫자 -> 정수로 변환		
		double douValue = Double.parseDouble(strValue);
    		
    		
		System.out.println(intValue);
		System.out.println(douValue);
		
		int score = 77;
		String str2 = String.valueOf(score);
		
		double score2 = 77;
		System.out.println(str2);
		
		System.out.printf("내가 좋아하는 돈의 액수 : %d원, 당신의 신용 점수는 %f점 입니다", intValue, score2);
		
	}

}
