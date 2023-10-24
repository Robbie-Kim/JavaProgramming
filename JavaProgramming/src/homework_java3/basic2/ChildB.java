package homework_java3.basic2;

public class ChildB extends Parent{
	
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
	
	public String fingerPrint;
	
	public ChildB()	{
		
	}
	
	public ChildB (String fingerPrint)	{
		this.fingerPrint = fingerPrint;
	}
	
	public void name()	{
		System.out.println("지문의 모양은 : " + fingerPrint + " 처럼 생겼습니다.");
	}
}
