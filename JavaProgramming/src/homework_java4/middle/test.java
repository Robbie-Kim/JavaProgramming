package homework_java4.middle;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "가나다";
		String reverseStr = "";		// str 을 반대로 해서 담을 배열
		
		
		for (int i = str.length()-1; i >= 0; i--)	{	// 정수형 변수 i 에다 str문자열의 길이를 담고
//			char j = ' ';										// 0이 될때까지 거꾸로 출력을 반복하는 구문
			
			reverseStr += str.charAt(i);			// reverseStr에 거꾸로 넣어줌.
//			System.out.print(reverseStr);
		}
		
		System.out.print(reverseStr);

	}
}
