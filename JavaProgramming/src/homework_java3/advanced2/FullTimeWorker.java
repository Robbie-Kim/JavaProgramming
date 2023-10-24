package homework_java3.advanced2;

public class FullTimeWorker extends Emproyee{
	int bonus;
	
	public FullTimeWorker(int eno, String name, int pay, int bonus)	{
		super.showEmployeeInfo();
		this.type = 1;
		this.bonus = bonus;
	}
	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return (pay / 12) + (bonus / 12);
	}
	@Override
	public void showEmployeeInfo()	{
		super.showEmployeeInfo();
		System.out.println("월급은 "+ getMonthPay() + " 입니다.");
	}
		
}
