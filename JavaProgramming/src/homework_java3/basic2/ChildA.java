package homework_java3.basic2;

public class ChildA extends Parent {
	
	public void firstname()	{
		super.firstname();
	}
	
	public void bloodtype()	{
		super.bloodtype();
	}
	public void height()	{
		super.height();
	}
	public void skincolor()	{
		super.skincolor();
	}
	
	public String name;
	
	public ChildA()	{
		
	}
	
	public ChildA (String name)	{
		this.name = name;
	}
	
	public void name()	{
		System.out.println("이름은 " + name + "입니다.");
	}
	
//	public void firstname() {
//		super.firstname();
//	}
	
}

