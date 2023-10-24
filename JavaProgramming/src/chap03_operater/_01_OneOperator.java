package chap03_operater;

public class _01_OneOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 부호연산자
		int num1 = 10;
		System.out.println(+num1);
		System.out.println(-num1);
		
		System.out.println("-----------");
		
		// 2. 증감연산자
		// 2-1. 전위 증감연산자
		int num2 = 20;
		
		if(++num2 > 20)	{
			System.out.println("num2는 20보다 큽니다.");
		}
		// 3. 후위 증감연산자
		int num3 = 20;
		
		if (num3++ > 20)	{
			System.out.println("num3는 20보다 큽니다.");
		}
		System.out.println(num3--);
		System.out.println(num3);
		
		System.out.println("--------------------");
		
		// 4. 전위, 후위 증감연산자의 혼합
		int num4 = 10;
		
		System.out.println(++num4);	// 출력 : 11 / 값 : 11
		
		System.out.println(num4++); //출력 : 11 / 값 : 12
		
		System.out.println(num4); 
		
		System.out.println(num4);
		
		System.out.println(num4);
		
	}

}
