package homework_java3.basic1;

public class Mammals {
	
	int height;
	int weight;
	
	
	public Mammals()	{
	
	}
	
	public Mammals (int height, int weight)	{
		this.height = height;
		this.weight = weight;
	}
	
	public void breed()	{
		System.out.println("새끼를 낳는다.");
	}
	public void ctrlTemp()	{
		System.out.println("체온을 조절한다.");
	}
	
}
