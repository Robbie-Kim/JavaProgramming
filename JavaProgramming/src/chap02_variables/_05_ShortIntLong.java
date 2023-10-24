package chap02_variables;

public class _05_ShortIntLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. short 타입의 변수 선언 및 초기화
		short sNum1 = 10;
		short sNum2 = 20;
		
		// 2. int 타입의 변수 선언 및 초기화
		int uNum1 = 200;
		int iNum2 = 200000000;
		
		//	3. long타입의 변수 선언 및 초기화
		// L이나 l붙이는거 외엔 차이가 없다.
		
		long lNum1 = 100L;
		long lNum2 = 100l;
		long lNum3 = 100;
		
		// int의 값을 초과하는 범위값을 지정할 때는 무조건 L이나 l을 붙어줘야 한다.
		
		long lNum4 = 500000000L;
		
		// 4.모든 타입은 범위를 초과하는 값을 저장하면 에러가 발생한다.
//		short sNum3 = 32768;
//		int iNum3 = 5000000000;
	}

}
