package homework_java2.basic1;

public class StudentInfo {
	// 학생의 속성과 정보를 저장하는 메소드
	public String name;
	public String major;
	public int number;
	
	
	public StudentInfo(String name,
					   String major,
					   int number) {
		this.name = name;
		this.major = major;
		this.number = number;
	}
	// 학생의 정보를 출력하는 메소드
	public void studentInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + major);
		System.out.println("번호 : " + number);
	}
	
}
