package chap02_variables;

public class _10_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 자동 형 변환 1
		// byte 크기가 작은 타입에서 큰 타입으로는 자동 형 변환이 일어난다.
		short sNum1 = 10;
		
		int iNum1 = sNum1;
		
		// 2. 자동 형 변환 2
		// 좀 더 세밀한 표현범위를 갖는 자료형으로 자동 형 변환이 일어난다. (정수 -> 실수)
		long lNum1 = 11000000L;
		
		float fNum1 = lNum1;
		
		// 3. 강제 형 변환
		// byte 크기가 큰 타입에서 작은 타입으로 변환할 때는 타입을 명시해줘야 한다.
		int iNum2 = 60;
		
//		short sNum2 = iNum2; // 에러 발생
		short sNum2 = (short)iNum2;	//
		
		int unicode = 65;
		System.out.println((char)unicode);
		
		char ch = (char)unicode;
		System.out.println(ch);
		
		// 덜 세밀한 표현범위를 갖는 타입으로 변환할 때도 타입을 명시한다.
		float fNum2 = 3.14f;
//		long lNum2 = fNum2; // f타입 (실수형)이 long 타입 (정수형)보다 세밀한 타입이기 때문에 오류발생
		long lNum2 = (long)fNum2;
		
		// 4. 연산에서의 형 변환
		// 형변환 순서에 따라 연산중에 더 byte크기가 크거나 좀 더 세밀한 표현범위를 갖는
		// 타입으로 자동 형 변환이 일어난다.
		
		long result1 = lNum2 + iNum2;	// int가 더 작은 타입이기때문에 결과는 long값으로 나옴

		// 강제 형 변환을 통해서 연산의 결과를 작은 타입으로 변경할 수도 있다.
		int result2 = (int)lNum2 + iNum2;
		int result3 = (int) (lNum2 + iNum2);
		
		// 5. 문자열 결합 연산
		// 문자열 결합 연산에서는 모든 자료형이 문자열로 변환된 후 연산된다.
		
		String str = "java";
		int version = 17;
		// "java" + "17" 로 변환이 되어 출력
		System.out.println(str + version);
		
		main
	}

}
