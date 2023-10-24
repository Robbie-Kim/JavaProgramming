package homework_java2.middle;

public class ConcatStr {
	// 필드값 문자열 str1, str2
	private String str1;
	private String str2;
	// 두개의 값을 초기화하는 생성자 작성
	public ConcatStr(String str1, String str2)	{
		this.str1 = str1;
		this.str2 = str2;
	}
	public String ConcatStr()	{
		return str1 + str2;
	}
	// 위 두개 문자열을 합친 새로운 문자열을 리턴하는 메소드를 완성하세요.
	public static void main(String[] args)	{
		String string1 = "Hello, ";
        String string2 = "World!";
        ConcatStr concatenator = new ConcatStr(string1, string2);
        String concatenatedString = concatenator.ConcatStr();
        System.out.println(concatenatedString); // "Hello, World!"\
		
	}
}

