package homework_java1;
import java.util.*;
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 1
//		 1. int num = 10;을 선언하고 증감연산자를 통해 다음과 같이 출력하세요. 출력된 값은 모두 증감연산자가 포함된 상태입니다.
//	     11
//	     12
//	     12
//	     10
//	     10
//	      8
		
//		int num = 10;
//		System.out.println(++num);	// 10 + (즉시) => 11
//		System.out.println(++num);	// 11 + (즉시) => 12
//		System.out.println(num--);	// 12 - (나중에) => 12
//		System.out.println(--num);	// 11 - (즉시) => 10
//		System.out.println(num--);	// 10 - (나중에) => 10
//		System.out.println(--num);	// 9 - (즉시) => 8
//		----------------------------------------------------
//		#2
//		 관계연산자(<, >) 두 개를 사용하여 int a = 10; int b = 20; 의 관계를 다음과 같이 출력하세요.
		
//	     true
//	     false
//		int a = 10;
//		int b = 20;
//		System.out.println(a<b);	// a < b 의 조건값을 출력
//		System.out.println(a>b);	// a > b 의 조건값을 출력
//		----------------------------------------------------
//		#3
//		 10 ~ 1까지 거꾸로 while문으로 출력
		
//		int i = 11;
//		while (i > 1) {
//			i--;
//			System.out.println(i);
//		}
//		----------------------------------------------------
//		#4
//		 10 ~ 1까지 거꾸로 do ~ while문으로 출력
//		
//		int i = 11;
//		do	{
//			i--;
//			System.out.println(i);
//		}	while (i > 1);
//		----------------------------------------------------
//		#5
//		10 ~ 1까지 거꾸로 for문으로 출력
		
//		for (int i = 10; i > 0; i--)	{
//			System.out.println(i);
//		}
//		----------------------------------------------------		
//		#6
//		1 ~ 100까지 합을 while문으로 출력
		
//		int i = 1;
//		int sum = 0;
//		while (i < 100)	{
//			i++;
//		sum += i;
//		}
//		System.out.println(sum);
//		----------------------------------------------------		
//		#7
//		1 ~ 100까지 합을 do ~ while문으로 출력
		
//		int i = 1;
//		int sum = 0;
//		do	{
//			i++;
//			sum += i;
//		}	while (i < 100);
//		System.out.println(sum);
//		----------------------------------------------------
//		#8
//		1 ~ 100까지 합을 for문으로 출력
		
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		----------------------------------------------------		
//		#9
//		int 10개짜리 배열 생성하여
//		int배열에 3의 배수를 차례대로 저장하세요.
//		그리고 거꾸로 출력하세요.
		
//		int[] intArr = new int [10];
//		
//		for (int i = 0; i < intArr.length; i++)	{
//			intArr[i] = (i + 1) * 3;
////			System.out.println(intArr[i]);
//		}
//		for (int i = intArr.length - 1; 0 <= i; i --)	{
//			System.out.println(intArr[i]);
//		}
//		----------------------------------------------------
//		#10
//		int배열을 10개 생성해라 
//		  사용자로부터 10개의 값을 입력받고 순서대로 출력하고 총합을 구하세요.
		
//		int[] intArr = new int [10];
//		int sum = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("10개의 값을 입력해주세요.");
//		
//		for (int i = 0; i < intArr.length; i++)	{
//			intArr[i] = sc.nextInt();
//			System.out.println(intArr[i]);
//		} 
//		for (int i = 0; i < intArr.length; i++) {
//			sum = sum + intArr[i];
//		}
//		System.out.println(sum);
//		----------------------------------------------------
//		#11
//		int 배열로 10개의 공간을 생성하세요.
//		  1 ~ 10까지의 임의의 수를 저장하고
//		  홀수만 골라서 출력하세요.
		
//		Random random = new Random();
//		int[] randomIntArr = new int [10];
//		
//		for (int i = 0; i < randomIntArr.length; i++)	{	// 배열 반복생성 구문
//			randomIntArr[i] = random.nextInt(10) + 1;		// 10 까지의 정수 랜덤 저장
//			if (randomIntArr[i] % 2 == 1)	{				// 홀수만 추출
//				System.out.println(randomIntArr[i]);		// 만든 추출 출
//			}
//		}
//		----------------------------------------------------
//		#12
//		정수 10개를 입력받아 배열에 저장하고, 
//	    이 정수중에서 2의 배수와 3의 배수를 출력하세요.
	   
//		int[] intArr = new int[10];
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < intArr.length; i++)	{
//			intArr[i] = sc.nextInt();								// 입력받은 값 배열에 저장
//			if (intArr[i] % 2 == 0 || intArr[i] % 3 == 0)	{		// 2의 배수 또는 3의 배수 추출
//				System.out.println(intArr[i]);						// 추출값 출력
//			}
//		}
//		----------------------------------------------------
	}	

}
