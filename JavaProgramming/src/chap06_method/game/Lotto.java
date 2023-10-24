package chap06_method.game;

import java.util.Random;

public class Lotto {
	// 1. 1 ~ 45 까지 숫자 중 랜덤 값 7개를 저장하는 배열을 리턴하는 메소드를 만드세요.
	// 중복 제거하는 로직 포함.	generateRandomArray
	
	public int[] generateRandomArray ()	{
		
		int[] lotto = new int[7];
		Random random = new Random();
		
		for (int i = 0; i < lotto.length; i++)	{
			lotto[i] = random.nextInt(45) + 1;
			
			if (i > 0)	{
				if (isDuplicated(lotto, i))	{
					i--;
					continue;
				}
			}
		}
		return lotto;
	}
		
		// 2. 중복체크하는 메소드 분리
		// isDuplicated 메소드 return 타입은 boolean, 매개변수 Int[] arr, int idx 
		public boolean isDuplicted(int arr, int idx) {
			for (int i = 0; i < idx; i++)	{
				if(arr[idx] == arr [i])	{
					return true;
				}
			}
		}
		
//		Random random = new Random();					// 랜덤함수 호출
//		
//		int lottoNum = random.nextInt(45) + 1;			// 1 ~ 45 로또 번호 생성
//		
//		for (int i = 0; i < 7; i++)	{
//			generateRandomArray()[i] = lottoNum;							// 배열에 번호 저
//			
//			// 중복제거
//			if (i > 0) {
//				for (int j = 0; j<1; j++)	{
//					if (generateRandomArray()[i] == generateRandomArray()[j])	{
//						i--;
//						break;
//					}
//				}
//				
//			}
//		}
//		return generateRandomArray();

