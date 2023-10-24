package homework_java3.basic3;

public class Worker {
	
	String name;
	
	public Worker()	{
		
	}
	public Worker (String name)	{
		this.name = name;
	}
	
	public void goToWork()	{
		System.out.println("출근합니다.");
	}
	public void leaveWork()	{
		System.out.println("퇴근합니다.");
	}
	public void work()	{
		System.out.println("일합니다.");
	}
}
