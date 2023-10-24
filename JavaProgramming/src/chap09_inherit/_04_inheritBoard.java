package chap09_inherit;

import chap09_inherit.board.FreeBoard;
import chap09_inherit.board.NoticeBoard;

public class _04_inheritBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 자식클래스는 부모의 형태도 가지고 있고 자식의 형태도 가지고 있어서
		// 부모타입으로도 자식타입으로도 사용할 수 있다.
		Board board = new FreeBoard (1, "제목", "내용", "작성자", "231023", "첨부파일.jpg");
		FreeBoard freeBoard = new Freeboard();
		NoticeBoard noticeBoard = new NoticeBoard(0, null, null)
	
		// 3. 자식클래스를 부모타입으로 사용하면 하나의 변수로 여러가지 자식클래스를
		// 사용할 수 있다. 다양한 형태로 사용할 수 있기때문에 다형성이라고 부른다.
		// Board 타입 변수에 FreeBoard 객체를 담아서
		// 공통기능인 InsertBoard()를 사용해도 FreeBoard의
		// insertBoard()가 실행된다.
		board = new Freeboard(1, "제목", "내용", "작성자", "231020",
								"첨부파일.jpg");
	
}
