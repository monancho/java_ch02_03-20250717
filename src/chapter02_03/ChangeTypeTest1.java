package chapter02_03;

/**
 * 
 */
public class ChangeTypeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte byteVar01 = 50;
		int intVar01;
		
		intVar01 = byteVar01;
		
		short shortVa1;
		
//		shortVa1 = intVar01;
		
		shortVa1 = (short) intVar01; // 강제 형변환 (casting)
		
		byte bv1;
		bv1 = (byte) shortVa1;
		
		System.out.print(intVar01);
		System.out.println(shortVa1);
		
		char charVar1;
		
		charVar1 = (char) intVar01;
		System.out.println(charVar1);
		
		double doubleVar1 = 3.4;
		double doubleVar2;
		int intVar2;
		int intVar3 = 100;
		
		intVar2 = (int) (doubleVar1 + 0.5);
		System.out.println(intVar2); // 3 -> 강제로 정수로 소수점을 버림으로 변환하여 저장
		doubleVar2 = intVar3;
		System.out.println(doubleVar2);
		
		
		double doubleVar3 = 314; // 314.0 저장
		int intVar4 = (int) 5.75; // 5 저장
		
		double doubleVar4 = 100 + 3.14; // 103.14
		int intVar5 = (int) (100 + 3.14); // 103
		
		int intVar6 = 5 / 3; // 1.6666... 값이 아닌 1이 출력 이유는 소수점이 버려지기에
		
		double doubleVar5 = 5 / 3; // 1.6666... 값이 아닌 1이 출력, 정수나눔은 무조건 소수점이 버려지기 떄문
		double doubleVar6 = 5.0 / 3; // 5가 5.0으로 변경됨으로서 소수 나누기 정수로가 됨으로서 소수점이 반영됨
		
		System.out.println(doubleVar5);
		System.out.println(doubleVar6);
		
		int intValue7 = 10;
		String strValue1 = "11";
		
		System.out.println(intValue7 + strValue1);
		
		int sum1 = intValue7 ;
		String sum2 = intValue7 + strValue1;
		
		System.out.println(sum1);
		System.out.println(sum2);
		
		
	}

}
