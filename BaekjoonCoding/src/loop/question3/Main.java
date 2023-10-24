package loop.question3;

import java.util.Scanner;

public class Main {

	// 3. 합
	// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		// sc 라는 Scanner 함수 호출
		int n = sc.nextInt();						// 정수 n에 입력되는값으로 초기화
		int sum = 0;								// 1 ~ n 까지 합을 입력할 정수 sum 초기화
		for (int i = 0; i <= n; i++)	{			// i를 0으로 초기화, 입력받은값 (n)이 될때까지 i 에다 1을 더해줌.
			sum += i;								// sum에다가 i의 값을 넣어주기 반복
//			System.out.println(sum);
		}
		System.out.println(sum);					// sum의 값을 출력
		
	}

}
