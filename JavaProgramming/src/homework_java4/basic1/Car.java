package homework_java4.basic1;

public interface Car {
	default void speedUp()	{
		System.out.println("속도를 높입니다.");
	}
	default void speedDown()	{
		System.out.println("속도를 낮춥니다.");
	}
	
}
