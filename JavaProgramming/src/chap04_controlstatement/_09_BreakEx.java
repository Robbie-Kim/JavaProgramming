package chap04_controlstatement;
import java.util.*;
public class _09_BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자가 입력한 숫자까지의 구구단을 출력하세요. 0을 입력하면 종료.
		Scanner sc = new Scanner(System.in);
		
		while (true)	{
			System.out.println("숫자를 입력하세요. 0은 종료");
			int userNum = sc.nextInt();
			
			if (userNum == 0)	{
				break;			//while문 종료
			}
			System.out.println("입력한 수 까지 구구단 입니다 : ");
			int gugu;
			int i;
			int j;
			for (i=1; i<=userNum; i++)	{
				for (j=1; j<=9; j++)	{
					System.out.println(i + " * " + j + " = " + (i * j) + " ");
					break;
				}
			}	
			
		}
		
		sc.close();
		
	}

}
