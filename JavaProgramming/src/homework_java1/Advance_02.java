package homework_java1;
import java.util.*;
public class Advance_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 사용자가 입력한 금액을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요.
//		   출력 개수는 단위가 큰 것 순서로 계산합니다
//		   예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.
		
		// 스캐너 호출
		Scanner sc = new Scanner(System.in);
		// 입력값 함수 지정
		int money = sc.nextInt();
		int omanWon = money / 50000;
		int manWon = money % 50000 / 10000;
		int ochunWon = money %10000 / 5000;
		int chunWon = money % 5000 / 1000;
		int obaekWon = money % 1000 / 500;
		int baekWon = money % 500 / 100;
		int osipWon = money % 100 / 50;
		int sipWon = money % 50 / 10;
		
		System.out.println("오만원 "+omanWon+"매, "
						  +"만원 "+manWon+"매, "
						  +"오천원 "+ochunWon+"매, "
						  +"천원 "+chunWon+"매, "
						  +"500원 "+obaekWon+"개, "
						  +"100원 "+baekWon+"개, "
						  +"50원 "+osipWon+"개, "
						  +"10원 "+sipWon+"개 입니다.");
		
		
	}

}
