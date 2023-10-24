package chap06_method.calc;

public class CompleteCalculator {
	// int형 매개변수 두개를 받는 메소드 add(덧셈), sub(뺄셈), mul(곱셈), div(나눗셈)
	// mod (나머지) 5개를 선언하세요. (div 메소드만 리턴타입 double, 나머지는 int)
	// 나눗셈과 나머지 분모에 0이 들어오면 0을 리턴하도록하세요.
	
	public int add (int a, int b)	{
		return (int) a + b;
	}
	public int sub (int a, int b) {
		return (int) a - b;
	}
	public int mul (int a, int b)	{
		return (int) a * b;
	}
	public double div (int a, int b) {
		if (b == 0 )	{
			return 0;
		}
		return (double) a / b;
	}
	public double mod (int a, int b) {
		if (b == 0) {
			return 0;
		}
		return (double) a % b;
	}
}
