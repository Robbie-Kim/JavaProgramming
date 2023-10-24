package homework_java3.advanced2;

public class ContractWorker extends Emproyee{
	int workDay;
	
	public ContractWorker (int eno, String name, int pay, int workDay) {
		super.showEmployeeInfo();
		this.type = 3;
		this.workDay = workDay;
	}
	
	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return (pay / workDay);
	}
	
	public void showEmployInfo()	{
		super.showEmployeeInfo();
		System.out.println("월급은 " + getMonthPay() + " 입니다.");
	}
}
