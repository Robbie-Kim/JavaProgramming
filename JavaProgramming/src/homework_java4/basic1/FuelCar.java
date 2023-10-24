package homework_java4.basic1;

public interface FuelCar extends Car{
	default void addFuel()	{
		System.out.println("화석연료로 동작합니다.");
	}
}
