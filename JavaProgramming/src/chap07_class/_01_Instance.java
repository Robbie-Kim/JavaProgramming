package chap07_class;

import chap07_class.car.Car;

public class _01_Instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 객체는 항상 변수로 만들어서 사용한다.
		
		Car car;
		
		// 2. 인스턴스화를 통해 객체를 생성한다.
		// 인스턴스화 (객체화)는 new + 생성자
		// 인스턴스화는 클래스의 변수나 메소드들을 사용할 수 있는 상태로 만들어준다.
		// (메모리에 올려준다.)
		car = new Car();
		
		// 기본타입은 0, false로 저장되고, 참조형타입 변수들은 null로 초기화
		System.out.println(car.color);
		System.out.println(car.company);
		System.out.println(car.model);
		System.out.println(car.price);
		
		// 3. 클래스의 멤버변수나 메소드의 사용은 ((변수명.변수 나 변수명.메소드명))로 사용.
		car.company = "현대";
		car.model = "제네시스";
		car.color = "검정";
		car.price =	50000000;
		
		car.carInfo();
		car.turnOn();
		car.turnOff();
		car.speedDown();
		car.speedUp();
		
	

		
	}
	// 클래스도 하나의 타입이라 메소드의 리턴 타입이나 매개변수로도 사용할 수 있다.
	// 리턴타입	: (45) Car generateCar
	// 입력값		: (45) Car car 
	// 리턴값		: (46) new Car
	public static Car generateCar(Car car)	{
		return new Car();
	}
}
