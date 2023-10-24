package loop.question4;

import java.util.Scanner;

/*
 * 준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다!
 * 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
 * 영수증에 적힌,

 * 구매한 각 물건의 가격과 개수
 * 구매한 물건들의 총 금액
 * 
 * 을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
 
 *** 입력 ***
 * 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.

 * 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.

 * 이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
 * 
 *** 출력 ***
 * 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면
 * Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();				// 영수증에 적힌 총 금액 X
		int n = sc.nextInt();				// 영수증에 적힌 구매한 물건의 종류의 수
		int sum = 0;						// 입력한 물건의 가격을 더해줄 sum
		
		
		for (int i = 0; i < n; i ++)	{	// n 만큼 반복문 실행
			int a = sc.nextInt();			// 구매한 물건의 가격 a
			int b = sc.nextInt();			// 구매한 물건의 가격 b
			
			sum += (a * b);					// sum에 a * b 의 값을 반복 입력
		}
		
		if (x == sum) {						// 총 금액 x의 값과 sum 을 비교해서 맞으면 Yes를 출력
			System.out.println("Yes");		  
		}	else {							// 총 금액 x의 값과 sum 을 비교해서 다르면 No를 출력
			System.out.println("No");
		}
//		int sum = 0;				// 합계를 넣을 sum 입력
//		
//		int i = 0;					// 반복문을 실행시킬 i 입력
//		
//		while (i <= n)	{			// n번째까지 반복문 실행
//		i++;
//		
//		int a = sc.nextInt();		// 입력받을 값 a
//		int b = sc.nextInt();		// 입력받을 값 b
//		
//		sum += (a * b);				// sum 에다가 a * b의 값을 넣어줌
//		
//		
//		}	
//		if (sum == x) {					// sum 값과 x 의 값 비교해서 
//			System.out.println("Yes");	// 같을시 Yes	출력
//		}	else	{
//			System.out.println("No");	// 다를시 No 출력
//		}
		
	}

}
