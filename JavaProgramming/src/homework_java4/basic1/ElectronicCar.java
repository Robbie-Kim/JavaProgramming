package homework_java4.basic1;

public interface ElectronicCar extends Car{
	default void charge() {
		System.out.println("전기로 동작합니다.");
	}
}
