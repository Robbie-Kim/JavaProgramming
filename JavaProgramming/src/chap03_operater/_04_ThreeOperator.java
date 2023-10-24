package chap03_operater;

public class _04_ThreeOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 삼항 조건연산자
		int num1 = 111;
		int num2 = 10;
		
		//           111 / 10 > 0 => true
		// 			 true => num1 - 11
		int result = num1 / num2 > 0 ? num1 - 11 : num2 - 11;
		System.out.println(result);
		
		result = num1 < 100 ? num1 * 10 : num1 / 10;
		System.out.println(result);
		
		// 2. 삼항 조건연산자의 중첩
					
										
		// 3. 대문자는 소문자로 소문자는 대문자로 바꿔서 출력
		char ch ='A';
		
		char convertCh = ch >= 'A' && ch <= 'Z'
						?
								(char)(ch+32)
						:
								(char)(ch)
		
		
		
		
		
		
		
		
		
		
		
	}

}
