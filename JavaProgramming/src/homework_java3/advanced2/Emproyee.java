package homework_java3.advanced2;

public abstract class Emproyee {
	int eno;				// 사번
	String name;
	int pay;
	int type;
	
	
	public Emproyee()	{
		
	}
	public Emproyee (int eno, String name, int pay, int type) {
		this.eno = eno;
		this.name = name;
		this.pay = pay;
	}
	
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public void showEmployeeInfo()	{
		System.out.println("사번은 " + eno + " 입니다.");
		System.out.println("이름은 " + name + " 입니다.");
		System.out.println("해당 사원의 급여는 " + pay + " 입니다.");
		System.out.println("해당 사원은 " + type + " 입니다." );
	}
	
	
//	public abstract void getMonthPay();
	public abstract double getMonthPay();
}
