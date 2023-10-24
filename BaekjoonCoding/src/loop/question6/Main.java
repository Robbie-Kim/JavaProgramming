package loop.question6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int userNum = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i <= userNum; i ++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
//			sum += a + b;
			System.out.println(a + b);
		}
	}

}
