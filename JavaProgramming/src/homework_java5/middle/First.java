//    사용자가 입력한 문자열을 받아서 가운데 문자를 출력하세요. 
//    문자열의 길이가 짝수면 가운데 두 글자 출력. ex) 비둘기 -> 둘, 비트캠프 -> 트캠
package homework_java5.middle;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사용자가 입력한 문자열을 받아서
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		char str = ' ';
//		char [] str = new char []
		int strLength = userInput.length();
		
		// 가운데 문자를 출력하세요.
		
		// 문자열의 길이가 짝수면 가운데 두 글자 출력.
		for (int i = 0; i < strLength; i++)	{
			str = userInput.charAt(i);
			if (strLength % 2 == 0)	{
				

			}
		}
		
		
	}

}
