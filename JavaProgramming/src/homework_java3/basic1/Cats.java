package homework_java3.basic1;

public class Cats extends Mammals{
	
	int legCnt;			// 
	int earCnt;			// 개체수
	
	
	public Cats()	{
		
	}
	
	public Cats(int height, int weight, int legCnt, int earCnt)	{
		this.height = height;
		this.weight = weight;
		this.legCnt = legCnt;
		this.earCnt = earCnt;
	}
	
	public void eat()	{
		System.out.println("육식을 한다.");
	}
	public void climb()	{
		System.out.println("나무를 잘 탄다.");
	}
}
