package homework_java3.extra;

import java.util.Scanner;

import homework_java3.extra.*;

public class UseOfEmployee {
	
//	private void saveInfo ()	{
//		
//		System.out.println("사번을 입력하세요.");
//		System.out.println("이름을 입력하세요.");
//		System.out.println("급여를 입력하세요.");
//		System.out.println("보너스를 입력하세요.");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int eno = 0;
		String name = "";
		int pay = 0;
		int bonus = 0;
		int hireYear = 0;
		int index = 0;
		int workDay = 0;
		
		Employee [] empArr = new Employee[100];
		
//		index = sc.nextInt();
		
//		while 문 종료시키기 위한 구문
		boolean exit = true;
		
		while(exit)	{
			
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 정규직 입력");
			System.out.println("2. 임시직 입력");
			System.out.println("3. 계약직 입력");
			System.out.println("4. 전체 정보 출력");
			System.out.println("5. 월급 정보 출력");
			System.out.println("6. 프로그램 종료");
			
			int inputNum = sc.nextInt();
			sc.nextLine();
			
			switch (inputNum)	{
			
			case 1 : 
				System.out.println("사번을 입력하세요.");
				eno = sc.nextInt();
				sc.nextLine();
				
				System.out.println("이름을 입력하세요.");
				name = sc.next();
				sc.nextLine();
				
				System.out.println("급여를 입력하세요.");
				pay = sc.nextInt();
				sc.nextLine();
				
				System.out.println("보너스를 입력하세요.");
				bonus = sc.nextInt();
				sc.nextLine();
				
				empArr[index++] = new RegularEmployee(eno, name, pay, inputNum, bonus);
				
				break;
				
			case 2:
				System.out.println("사번을 입력하세요.");
				eno = sc.nextInt();
				sc.nextLine();
				
				System.out.println("이름을 입력하세요.");
				name = sc.next();
				sc.nextLine();
				
				System.out.println("급여를 입력하세요.");
				pay = sc.nextInt();
				sc.nextLine();
				
				System.out.println("근무년수를 입력하세요.");
				hireYear = sc.nextInt();
				sc.nextLine();
				
				empArr[index++] = new TempEmployee(eno, name, pay, inputNum, hireYear);
				break;
				
			case 3:
				System.out.println("사번을 입력하세요.");
				eno = sc.nextInt();
				sc.nextLine();
				
				System.out.println("이름을 입력하세요.");
				name = sc.next();
				sc.nextLine();
				
				System.out.println("급여를 입력하세요.");
				pay = sc.nextInt();
				sc.nextLine();
				
				System.out.println("근무일수를 입력하세요.");
				bonus = sc.nextInt();
				sc.nextLine();
				
				//////////////// 제일 중요한 구문 ////////////////////
				// 부모 형태에 자식 객체를 담아 구현
				empArr[index++] = new ContractEmployee(eno, name, pay, inputNum, workDay);
				break;
				//////////////////////////////////////////////////
			case 4:
				for (int i = 0; i < index; i++)	{
					empArr[i].showEmployeeInfo();
					System.out.println("----------구분선 입니다----------");
				}
				break;
				
			case 5:
				System.out.println("검색할 사원의 사번을 입력하세요.");
				eno = sc.nextInt();
				sc.nextLine();
				
				for (int i = 0; i < index; i ++)	{
					if (empArr[i].getEno() == eno) {
						empArr[i].showEmployeeInfo();
						System.out.println("----------구분선 입니다----------");
					}
				}
				break;
				
			case 6:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				
//				System.exit(0);	// 0번이 프로그램 아예 종료
//				isExit = true;
//				break;
				
				
			default :
				System.out.println("잘 못 선택하셨습니다.");
				continue; // while문으로 돌아감
			}
//			// while 문 종료시키기 위한 구문
			if (exit == true)	{
				break;
			}
		}	
		
	}

}
