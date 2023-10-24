package homework_java4.middle;

import java.util.Scanner;

public class test2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String userString = sc.nextLine();						// 사용자가 입력한 문자열
		String deleteString = "";								// 제거해야할 문자열
		
		
		for (int i = 0; i <= userString.length(); i ++)	{	// userString 문자열의 길이가 될때까지 i를 증가시킨다.
//			if 
			
			
			
			
			deleteString += userString.charAt(i); 												// userString 에서 문자 하나하나를 추출한다.
		}
			
//		if (true)	{										//제거해야할 문자열과 사용자가 입력한 문자열이 같을때
//				
//		}
		System.out.println(deleteString);
	}
}
