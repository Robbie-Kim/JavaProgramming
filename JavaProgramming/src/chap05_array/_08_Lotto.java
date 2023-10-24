package chap05_array;
import java.util.*;
public class _08_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] lottoArr = new int [7];						// 정수 7개 저장 배열
		
		Random randomInt = new Random();					// 랜덤함수 호출
		
		int lottoNum = randomInt.nextInt(45) + 1;			// 1 ~ 45 로또 번호 생성
		
		for (int i = 0; i < lottoArr.length; i++)	{
			lottoArr[i] = lottoNum;							// 배열에 번호 저
			
			// 중복제거
			if (i > 0) {
				for (int j = 0; j<1; j++)	{
					if (lottoArr[i] == lottoArr[j])	{
						i--;
						break;
					}
				}
				
			}
		}
		
		System.out.println("이번주 로또 번호는 ");
		for(int i = 0; i < lottoArr.length; i++)	{
			if (i == lottoArr.length -1)	{
				System.out.println(" 보너스 번호 : " + lottoArr[i]);
			}	else	{
				System.out.println(lottoArr[i] + ", ");
			}
		}
	}

}
