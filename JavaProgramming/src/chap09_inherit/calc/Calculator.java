package chap09_inherit.calc;

// Calculator를 상속받은 Add(덧셈), Sub(뺄셈), Mul(곱셈)
// Div(나눗셈) 클래스를 만들고 오버라이드 된 메소드 calculate()를 구현하세요.
public class Calculator {
	int a;
	int b;
	public Calculator()	{
		
	}
	
	public Calculator (int a, int b)	{
		this.a = a;
		this.b = b;
	}
	public int add (int a, int b)	{
		return a + b;
	}
	public int sub (int a, int b)	{
		return a - b;
	}
	public int mul (int a, int b)	{
		return a * b;
	}
	public int div (int a, int b)	{
		return a / b;
	}

	
	public int calculate()	{
		return 0;
	}
	
	
}
