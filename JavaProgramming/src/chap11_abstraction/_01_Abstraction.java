package chap11_abstraction;

import chap11_abstraction.academy.Academy;
import chap11_abstraction.academy.ComAcademy;
import chap11_abstraction.academy.EngAcademy;

public class _01_Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 추상클래스는 인스턴스화를 할 수 없다.
		// 인스턴스화 하는 순간 객체의 변수나 메소드가 메모리에 올라가야 하는데
		// 추상메소드는 동작이 없어서 메모리에 저장될 수 없는 상태이기 때문이다.
		// 추상클래스나 인터페이스는 무조건 자식클래스를 만들어서 자식의 객체를 사용한다.
		
		// 자식 클래스인 ComAcademy를 객체화 시킨다.
		Academy academy = new ComAcademy();		// 이게 '객체화' 이다. 다른말로 '인스턴스화'
		academy.teach();
		academy.solveHomework();
		academy.rest();
		academy.attend();
		
		// ComAcademy로 객체화를 시켰기 때문에 다른 자식 클래스인 EngAcademy도 객체화가 가능하다.
		academy = new EngAcademy();
		academy.teach();
		academy.solveHomework();
		academy.rest();
		academy.attend();
	}

}
