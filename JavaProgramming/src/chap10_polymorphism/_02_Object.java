package chap10_polymorphism;

import chap10_polymorphism.tv.MiTv;

public class _02_Object {
	public static void main(String[] args) {
		// 1. Java의 모든 클래스들은 Object를 상속받아서 만들어진다.
		MiTv mitv = new MiTv();
		mitv.equals(mitv);
		
		
	}
}

