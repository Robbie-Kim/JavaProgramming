package chap06_method;

import chap06_method.calc.OverloadingCalculator;

public class _04_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		double dNum = 30.0;
		
		int result;
		
		OverloadingCalculator ocalc = new OverloadingCalculator();
		
		result = ocalc.add(num1);
		System.out.println(result);
		
		result = ocalc.add(dNum, num1);
		System.out.println(result);
		
//		result = ocalc.add(dNum, dNum);	// double형 2개를 받는 변수는 없기때문에 에러 발생.
		
		
	}

}
