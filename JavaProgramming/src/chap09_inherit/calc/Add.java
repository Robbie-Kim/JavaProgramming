package chap09_inherit.calc;

public class Add extends Calculator {
	
	public Add(int a, int b) {
		this.a = a;
		this.b = b;
	}
	//오버라이딩 된 메소드
	public int calculate()	{
		return a + b;
	}
		
}

// 같은식으로 Sub, Mul, Div 등도 만들기.