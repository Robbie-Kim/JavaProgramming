package chap02_variables;

public class _02_ScopeOfVariables {
	
	static int num;	// 1. 클래스 변수 선언 , 클래스 중괄호 안에서 어디서든지 접근가능

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mainNum = 10;	// 2. 메소드 지역변수 선언
		int sum = 0;
		
		if (sum == 0 ) {
			int ifNum = 20;
			sum = mainNum + ifNum; // 3. 조건문의 지역변
		}
		System.out.println(sum);
		
		//System.out.println(ifNum);	// 조건문 중괄호 블록에서 선언된 변수는 밖에서 사용불가능
		
		num = 30;
		System.out.println(num);
		
		getSum();	// getSum() 메소드 호출
		
		
		}
	
	public static void getSum()	{	// 5. 메소드의 지역변수 선언
		int localVall1 = 50;
		int localVall2 = 60;
		int localResult = localVall1 + localVall2;
		
		num = 100;	// class변수라 어디든 사용 가능
		
		System.out.println(localResult + num);
	}

}
