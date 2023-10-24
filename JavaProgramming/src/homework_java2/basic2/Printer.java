package homework_java2.basic2;

import homework_java2.basic2.BookInfo;

// 도서의 제목, 저자, 출판사, 가격 정보를 출력
public class Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		BookInfo bookinfo = new BookInfo("이것이 자바다", "신용권", "한빛미디어", 25000);
		
		bookinfo.bookInfo();
		
	}

}