package loop.question5;


// (입력받은 수 / 4 ) * long 이 출력되도록 만들자.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);				// 스캐너 매서드 호출
		
		int userNum = sc.nextInt();							// 입력받을 값 userNum 인스턴스화
		String arr = "";									// long 을 담아둘 문자열 선언
		sc.close();											// 스캐너 매서드 종료
		
		for (int i = 1; i <= userNum/4; i++)	{			// for 반복문 시작, 입력받은 값 / 4 가 1이 될때까지.
			arr += "long ";									// 문자열에 long 을 계속 입력해서 더해줌.
		}
		System.out.println(arr + "int");					// arr 배열에 저장된 값에 int 를 더해서 출력
	}
}
//		Scanner sc = new Scanner(System.in);
//		
//		int userNum = sc.nextInt();								// 입력받은 수 저장
//		int arrNum = userNum/4;									// 입력받은 수를 /4 해줄 정수 선언
//		String [] arr = new String[arrNum];						// 입력받은 수 만큼 받아서 long 을 담아둘 문자열 선언
//		for (int i = 0; i <= arrNum; i++)	{					// for 반복문 시작
//			
//			arr [i] = "long";									// arr i 에다 long 값 입력
//
//		}
//		
//		for (int j = 0; j <= arrNum; j++)	{
//
//			System.out.print(arr[j]);
//		}
//		
//	}


