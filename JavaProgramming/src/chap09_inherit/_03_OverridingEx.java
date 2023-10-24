package chap09_inherit;

import chap09_inherit.calc.Add;
import chap09_inherit.calc.Calculator;

public class _03_OverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add add = new Add(20,10);
		int result = add.calculate();
		System.out.println(result);
		
		// 부모 타입의 변수에 자식 객체를 담아서 오버라이딩된 메소드를 사용하면
		// 자식 클래스에 정의된 메소드가 실행된다.
		Calculator calc = new Add (20,10);	// Calculator : 부모 타입의 변수
											// Add 		  : 자식 객체
		result = calc.calculate();
		System.out.println(result);	// 값은 30이 나옴.
		
	}

}
