package homework_java3.basic2;

public class Parent {
	String firstname;
	String bloodtype;
	int height;
	String skincolor;
	
	public Parent()	{
		
	}
	
	public Parent(String firstname, String bloodtype, int height, String skincolor) {
		this.firstname = firstname;
		this.bloodtype = bloodtype;
		this.height = height;
		this.skincolor = skincolor;
	}
	public void firstname()	{
		System.out.println("성씨는 " + firstname + "씨 입니다.");
	}
	public void bloodtype()	{
		System.out.println("혈액형은 " + bloodtype + " 입니다.");
	}
	public void height()	{
		System.out.println("키는 " + height + " 입니다.");
	}
	public void skincolor() {
		System.out.println("피부색은 " + skincolor +  " 입니다.");
	}
	
}
