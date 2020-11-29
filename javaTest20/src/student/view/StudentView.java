package student.view;

import java.util.Scanner;

import student.controller.StudentController;
import student.model.vo.Student;



public class StudentView {
	
	Scanner sc = new Scanner(System.in);
	StudentController stuCon = new StudentController();
	
//	-> mainMemu 메소드 (다음 메뉴 출력및 선택)
//    1. 학생 전체 정보 출력
//    2. 학생 정보 조회(학번)
//    3. 학생 정보 입력
//    4. 학생 정보 변경
//    5. 학생 삭제
//    0. 프로그램 종료
	public void mainMenu() {
		
		outer :
		while(true) {
			
			System.out.println("---------------메인 메뉴---------------\n"
					+ "\t1. 학생 전체 정보 출력\n"
					+ "\t2. 학생 정보 조회(학번)\n"
					+ "\t3. 학생 정보 입력\n"
					+ "\t4. 학생 정보 변경\n"
					+ "\t5. 학생 삭제\n"
					+ "\t0. 프로그램 종료\n"
					+ "-----------------------------------");		// 메인메뉴
			System.out.print("선택할 메뉴 번호를 입력하세요 : ");
			int userInput = sc.nextInt();
			
			switch(userInput) {							// 번호 입력시 메소드 실행
			case 1 : selectAll(); break;
			case 2 : selectOne(); break;
			case 3 : insertStudent(); break;
			case 4 : updateStudent(); break;
			case 5 : deleteStudent(); break;
			case 0 : break outer;							// 바깥 루프를 정지하여 프로그램 종료
			default : System.out.println("잘못 입력하셨습니다. 다시 선택해주세요."); break;
			}
		}		// while 괄호
	
	System.out.println("프로그램을 종료합니다.");
		
	}	// mainMenu 괄호
	
	
	
	//	-> selectAll 메소드 (학생 전체 출력 메소드 - 로직은 컨트롤러에서 하고, 결과 출력만 담당)
	public void selectAll() {
		
		for(Object o : stuCon.selectAll()) {				// 모든 학생정보 출력
			System.out.printf("%d\t%s\t%d\t%s\t\t%.2f%n",
					((Student)o).getNo(), ((Student)o).getName(), ((Student)o).getAge(), ((Student)o).getAddress(), ((Student)o).getGrade());
		}					// 오브젝트를 스튜던트형으로 다운캐스팅. 이후 겟메소드로 출력
	}
	
	

	//	-> selectOne 메소드 (학생 한명 조회 메소드 - 로직은 컨트롤러에서 하고, 사용자입력 및 결과 출력만 담당)
	public void selectOne() {
		
		System.out.print("조회할 학생의 학번을 입력하세요 : ");
		int num = sc.nextInt();
		Student s;
		
		try {
			s = stuCon.selectOne(num);						// 메소드 실행 및 저장
			System.out.printf("%d\t%s\t%d\t%s\t\t%.2f%n",
					s.getNo(), s.getName(), s.getAge(), s.getAddress(), s.getGrade());		
		} catch(Exception e) {
			System.out.println("학번이 잘못되었습니다. 메뉴로 돌아갑니다.");	// 컨트롤러 클래스의 selectOne이 돌 경우, 다 돌때까지 맞는 학번이 없다면
			return;												// 인덱스를 초과한 값을 부르기 때문에 예외 발생. 이 때 메시지 출력.
		}
	}
	
	
	
	//	-> insertStudent 메소드 (학생 정보 입력 메소드 - 로직은 컨트롤러에서 하고, 사용자입력 및 결과 출력만 담당)
	public void insertStudent() {
		
		try {
			System.out.print("추가할 학생의 학번을 입력하세요 : ");
			int no = sc.nextInt();
			System.out.print("추가할 학생의 이름을 입력하세요 : ");
			String name = sc.next();
			System.out.print("추가할 학생의 나이를 입력하세요 : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("추가할 학생의 주소를 입력하세요 : ");
			String address = sc.nextLine();
			System.out.print("추가할 학생의 학점을 입력하세요 : ");
			double grade = sc.nextDouble();
			
			stuCon.insertStudent(new Student(no, name, age, address, grade));		// 학생정보 추가 메소드
			
		} catch(Exception e) {
			System.out.println("잘못된 입력이 있습니다. 메인 메뉴로 돌아갑니다.");	// 타입에 맞지 않는 정보 입력시 에외처리
			return;
		}
		System.out.println("정상적으로 추가되었습니다.");
	}
	
	
	
	//	-> updateStudent 메소드 (학생 정보 변경 메소드 - 로직은 컨트롤러에서 하고, 사용자입력 및 결과 출력만 담당)
	public void updateStudent() {
		
		System.out.print("변경될(제거될) 학생의 학번을 입력해주세요 : ");
		int classNumber = sc.nextInt();
		int i;
		Student s = null;						// 밑에서도 쓰기 때문에 첫 포문의 지역변수가 아닌 바깥 변수 지정
		
		for(i=0; i<stuCon.selectAll().size(); i++) {			// 리스트 크기만큼 반복
			
			if(stuCon.selectAll().get(i).getNo() == classNumber) {
				System.out.println("학생의 정보를 찾았습니다.");
				s = stuCon.selectAll().get(i);
				System.out.printf("%d\t%s\t%d\t%s\t\t%.2f%n",
						s.getNo(), s.getName(), s.getAge(), s.getAddress(), s.getGrade());
				System.out.print("계속 하시겠습니까? (진행 희망시 y 입력) : ");
				char yn = sc.next().charAt(0);
				
				if(yn == 'y') break;				// y 입력시 반복문 깨고 아래로 진행
				else {
					System.out.println("취소되었습니다. 메인메뉴로 돌아갑니다.");		// 이외에는 취소 처리
					return;
				}
			}
			else if(i == stuCon.selectAll().size()-1 && stuCon.selectAll().get(i).getNo() != classNumber) {
				System.out.println("학생정보를 찾을 수 없습니다. 메인 메뉴로 돌아갑니다.");
				return;					// i 인덱스가 리스트 크기만큼 돌았는데 여전히 맞는 학번이 없다면, 없는 것으로 간주하고 메뉴로 돌아감.
			}
		}
		
		System.out.print("추가될 학생의 학번을 입력해주세요 : ");
		int no = sc.nextInt();
		System.out.print("추가될 학생의 이름을 입력해주세요 : ");
		String name = sc.next();
		System.out.print("추가될 학생의 나이를 입력해주세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("추가될 학생의 주소를 입력해주세요 : ");
		String address = sc.nextLine();
		System.out.print("추가될 학생의 학점을 입력해주세요 : ");
		double grade = sc.nextDouble();
		
		System.out.printf("입력하신 학생 정보는 다음과 같습니다.%n"
				+ "기존 학생 정보 : %d\t%s\t%d\t%s\t\t%.2f%n"
				+ "대체될 학생 정보 : %d\t%s\t%d\t%s\t\t%.2f%n", 
				s.getNo(), s.getName(), s.getAge(), s.getAddress(), s.getGrade(), 
				no, name, age, address, grade);
		System.out.println("변경을 진행하시겠습니까? (진행 희망시 y 입력) : ");
		char yn = sc.next().charAt(0);
		
		if(!(yn == 'y')) {
			System.out.println("취소하셨습니다. 메인메뉴로 돌아갑니다.");
			return;
		}
		
		stuCon.updateStudent(stuCon.selectAll().get(i), new Student(no, name, age, address, grade));
		System.out.println("성공적으로 진행되었습니다.");					// 변경 메소드 진행
	}
	
	
	
	//	-> deleteStudent 메소드 (학생 정보 삭제 메소드 - 로직은 컨트롤러에서 하고, 사용자입력 및 결과 출력만 담당)
	public void deleteStudent() {
		
		System.out.print("삭제할 학생의 학번을 입력해주세요 : ");
		int classNumber = sc.nextInt();
		
		stuCon.deleteStudent(classNumber);
		
	}
	
}
