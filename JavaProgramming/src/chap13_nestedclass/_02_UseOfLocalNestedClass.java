package chap13_nestedclass;

public class _02_UseOfLocalNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 지역 중첩 클래스는 따로 객체 생성이 불가능하다.
		LocalNestedClass lnc = new LocalNestedClass();
		
		lnc.speedUp();
		
//		Engine eg = new Engine();		>> 등의 사용 불가능.
	}

}
