package chap08_static;

import chap08_static.car.Car;

public class _01_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. static 변수나 메소드의 사용
		// Class원형. 변수명, 메소드명으로 사용한다.
		/* car 패키지의 Ca 클래스와 관련있는 내용임 */
			Car.grade = "B";
			Car.getCurrentGrade();
			
		// 2. 인스턴스 변수나 메소드는 항상 객체를 생성해서 사용한다.
		Car car = new Car();	
		car.company = "현대";
		car.model	= "제네시스";
		car.color	= "검정";
		car.price	= 500000000;
		car.carInfo();
		
		// 3. 인스턴스 변수는 클래스 원형으로 접근할 수 없다.
		
//		Car.company = "기아";		==> Car.company, model ... 는 인스턴스 변수로 선언된것이기 때문에
//		Car.carInfo();			    바로 접근 불가
		
		
		
	}

}