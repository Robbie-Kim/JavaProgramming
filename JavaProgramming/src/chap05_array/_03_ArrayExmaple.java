package chap05_array;

public class _03_ArrayExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. chArr의 요소 중 소문자는 대문자, 대문자는 소문자로 변경하여
		// convertArr에 저장
		char[] chArr = {'b','I','t','C'};
		
		char[] convertArr = new char[4];
		
		
		for (int i = 0; i < chArr.length; i++)	{
			if(chArr[i] >= 'A' && chArr[i] <= 'Z')	{
				convertArr[i] = (char)(chArr[i]+32);		// ASCII 코드에서 대문자 -32 == 소문자
				
			}	else {
				convertArr[i] = (char)(chArr[i]-32);
			}
		}
		System.out.println(convertArr);
	}

}
