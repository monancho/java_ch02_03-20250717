package chapter03_02;

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 80;
		score = score + 10;
		System.out.println(score);
		
		int a = 0;
		a = a + 1;
		int b = 10;
		b = b - 1;
		
		int c = 0;
		System.out.println(c++);
		System.out.println(c++);
		
		int x = 1;
		int y = 1;
		int z = 2;
		int z2 = 2;
		
		int result1 = x++ + ++z + 10;
		int result2 = ++y + z2++ + 10;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		
		int xx = 1;
		int yy = 1;
		System.out.println(xx++);
		System.out.println(++yy);
		System.out.println(xx);
		System.out.println(yy);
		
		System.out.println(17 / 3); // 나누기 나눈값 
		System.out.println(17 % 3); // 나머지 나누고 남은값
		
		int kor = 90;
		int eng = 85;
		int math = 70;
		int sci = 50;
		
		// 국영수 세과목 중 1과목이라도 90점 이상이면 우수
		if(kor >= 90 || eng >= 90 || math >= 90) { //if 가로 조건식 중괄호
			System.out.println("우수");
		};
		
		// 네 과목 점수 중 1과목이라도 60점 미만이면 "과락"
		if(kor < 60 || eng < 60 || math < 60 || sci < 60) {
			System.out.println("과락");
		};
		if(!(kor > 60 && eng > 60 && math > 60 && sci > 60)) {
			System.out.println("과락");
		};
		//깃 업로드
	}
}
