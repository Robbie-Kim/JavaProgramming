package homework_java3.basic1;

public class Lion extends Cats{
	
	int age;
	int num;
	
	public Lion()	{
		
	}
	
	public Lion (int age, int num)	{
		this.age = age;
		this.num = num;
	}
	
	public void liveCountry()	{
		System.out.println("주로 아프리카에 산다.");
	}
	public void group()	{
		System.out.println("무리 생활을 한다.");
	}
}
