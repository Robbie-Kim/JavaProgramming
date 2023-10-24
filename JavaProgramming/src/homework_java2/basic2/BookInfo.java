package homework_java2.basic2;

public class BookInfo {
	// 도서의 제목, 저자, 출판사, 가격 속성값 메소드
	public String title;
	public String writter;
	public String company;
	public int price;
	
	// 생성자 정의 (도서의 정보 저장)
	public BookInfo(String title,
					String writter,
					String company,
					int price)		{
		this.title = title;
		this.writter = writter;
		this.company = company;
		this.price	= price;
	}
//	// 도서의 매개변수
//	public BookInfo(String title,
//					String writter,
//					String company,
//					int price)	{
//		this.title = title;
//		this.writter = writter;
//		this.company = company;
//		this.price = price;
//	}

	// 도서의 정보를 출력하는 메소드
	public void bookInfo() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writter);
		System.out.println("출판사 : " + company);
		System.out.println("가격 : " + price);
	}
}
