package chapter02_01;

public class TestClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 3; // integer 타입의 hour 변수를 선언, 초기값 3으로 초기화
		int mintute = 50;
		
		System.out.println("현재 남은 시간은 " + hour + "시 " + mintute + "분 입니다.");
		int totalMinute;
		
		totalMinute = hour * 60 + mintute;
		System.out.println("남은 시간을 분으로 출력한 값은 " + totalMinute + "분 입니다.");
		
		int a;
		int b;
		
		a = 100;
		b = 10;
		System.out.println(a + b);
		b = a * b;
		System.out.println(a + b);
		b = a * b;
		System.out.println(a + b);
	}

}
