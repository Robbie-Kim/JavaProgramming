package chap04_controlstatement;

public class _01_ifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lunchPrice = 10000;
		
		if (lunchPrice > 10000)	{
			System.out.println("비싸다.");
		}	else if (lunchPrice > 8500)	{
			System.out.println("조금 비싸다.");
		}	else if (lunchPrice > 6000) {
			System.out.println("적정하다.");
		}	else if (lunchPrice > 5000)	{
			System.out.println("조금 싸다");
		}	else	{
			System.out.println("싸다");
		}
		
		System.out.println("----------------------------------------");
		
		int num1 = 12345;
		if (num1 % 2 == 0)	{
			System.out.println("num1은 짝수입니다.");
		}	else	{
			System.out.println("num1은 홀수입니다.");
		}
	}

}
