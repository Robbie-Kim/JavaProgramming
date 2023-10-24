package homework_java1;
import java.util.*;
public class Advance_03 {
	public static void main(String[] args) {
//		3. 369게임을 작성합니다.
//		   1~99까지의 정수를 입력받고
//		   3,6,9중 하나가 있으면 "박수짝"을 출력하고
//		   2개가 있으면 "박수짝짝"을 출력하세요
//		   예를 들어 13은 "박수짝"
//		   36인 경우는 "박수짝짝"을 출력하면 됩니다.
		while (true)	{
		System.out.println("1 ~ 99 까지의 정수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num < 1 || num > 99)	{
			System.out.println("숫자를 다시 입력해주십시오.");
			continue;
		}
		
		
		int x = num / 10;	// 십의 자리 수 
		int y = num % 10;	// 1의 자리 수
		int clap = 0;
		
		if(num < 10)	{
			if (y % 3 == 0)	
					clap++;
		}
		else	{
			if (x % 3 == 0)	{
					clap++;
			}
			if (y % 3 == 0) {
					clap++;
			}
		}	
			 
		switch (clap)	{
		case 1 : 
			System.out.println("박수짝");
			break;
		case 2 :
			System.out.println("박수짝짝");
			break;
			}
		}
	}
}
