package homework_java3.advanced2;

public class TempWorker extends Emproyee{
	int hireYear;
	
	public TempWorker (int eno, String name, int pay, int hireYear)	{
		super.showEmployeeInfo();
		this.type = 2;
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return (pay / 12);
	}
	public void showEmployeeInfo()	{
		super.showEmployeeInfo();
		System.out.println("월급은 " + getMonthPay() + " 입니다.");
	}
}
