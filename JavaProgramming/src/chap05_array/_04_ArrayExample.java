package chap05_array;
import java.util.Random;
public class _04_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Random 값을 생성하는 방법 1
		// Random 클래스 사용
		Random random = new Random();
		//random.nextInt(3) => 0, 1, 2 중 랜덤 
		int randomValue = random.nextInt(3);
		System.out.println(randomValue);
		
		//random.nextInt(3) + 1 => 1, 2, 3 중 랜덤
//		int randomValue = random.nextInt(3) + 1;
		System.out.println(randomValue);
		
		
		// 2. Random 값을 생성하는 방법 2
		// Math 클래스의 Random() 메소드 사용
		// 0 <= Math.random() < 1 의 실수를 랜덤으로 선택
		// (int)0 <= (int)Math.random() < (int)1
		// 0 * 10 <= Math.random * 10 < 1 * 10
		// (int)0 <= (int)(Math.random * 10) + 1 < (int)10 + 1
		// 1~45 까지의 랜덤값 생성
		randomValue = (int)(Math.random() * 45) + 1;
//		System.out.println(randomValues);
		
		// 3. 정수 10개를 갖는 배열을 생성하고 1 ~ 10 까지의 랜덤값을 저장하세요.
		
		int[] randomIntArr = new int[10];
		
		
		for (int i = 0; i < randomIntArr.length; i ++)	{
			randomIntArr[i] = random.nextInt(10) + 1;
		}
	}

}