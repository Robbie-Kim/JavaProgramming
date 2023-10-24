package chap02_variables;

public class _01_Variables {

	public static void main(String[] args) {
		// 1. 변수의 선언
		// 1 -1. 변수의 선언은 '자료형 변수명' 형태로 진행
		
		int likeCnt;	// 좋아요 개수를 저장하는 변수
		
		boolean isUserLikeClick;	// 로그인한 사용자가 좋아요를 눌렀는지 저장하는 변수
		
		// 1-2. 변수명의 첫 글자는 문자, $, _만 허용된다.
		int price;
		int _bit;
		int $company;
		
		// 문자, $, _가 아닌 다른 기호, 숫자가 첫 글자로 오면 에러가 발생한다.
		
		/*
		 * int 1price;
		 * int @bit;
		 * int %company;
		 */
		
		// ctrl + shift + / (mac에서는 ctrl + cmd + / ) : 다중행 주석처리
		// ctrl + / (mac에서는 cmd + / : 단일행 주석처
		
		// 1-3. 카멜케이스 표기법 사용

		int boardCnt; 		// 게시물 개수
		int printCnt;		// 출력 횟수
		
		// 1-4. 대소문자를 구분한다.
		
		int lunchTime;		// 점심시간
		int luNchTime;		
		int lunchtime;
		
		// 1-5. 본인만 알아볼 수 있는 변수명을 사용하지 않는다.
		
		int aaa;
		int bbb;
		int ccc;
		
		// 2. 변수 사용
		// 2-1. 변수에 값 저장
		// 변수에 값을 최초로 값을 저장(할당) 하는 것을 초기화라고 한다.
		
		likeCnt = 1500; // 변수에 1500이라는 정수값 저장
		
		System.out.println(likeCnt);	// 번수 불러오기
		
		likeCnt = 100;	// 변수의 값을 재할당 (값의 변경)
		
		System.out.println(likeCnt);
		
		// 2-2. 변수의 선언과 동시에 초기화
		
		int studentCnt = 16;
		System.out.println(studentCnt);
		
		// 2-3. 선언된 변수에는 선언 시에 지정한 자료형의 값만 저장할 수 있다.

//		studentCnt = 11.11;	// 정수형으로 선언된 변수에 실수값을 넣었기 때문에 에러발생.
		
		// 2-4. 초기화 (값이 저장되지 않은) 되지 않은 변수를 사용하면 에러가 발생한다.
		
		int errorVal;
//		System.out.print(errorVal);
	}

}
