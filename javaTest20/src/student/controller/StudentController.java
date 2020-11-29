package student.controller;

import java.util.ArrayList;
import java.util.Scanner;

import student.model.vo.Student;



public class StudentController {
	
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Student> stuAr = new ArrayList<>();
	

	//	-> public ArrayList<Student> selectAll()  // 학생 전체 조회 메소드
	
	public ArrayList<Student> selectAll() {
		
		return stuAr;		// 리스트를 반환하고 있음
	}

	
	//	-> public Student selectOne(int classNumber)  // 학생 한명 조회 메소드
	public Student selectOne(int classNumber) {
		
		int idx = 0;		// 인덱스 선언
		
		for(int i=0; i<stuAr.size(); i++) {
			Student s = stuAr.get(i);
			if(s.getNo() == classNumber) break;
			idx++;					// 브레이크 되지 않으면 인덱스를 계속 1씩 추가.
		}							// 만약 사이즈가 10인데 끝까지 돈다면 10이 반환될 것임(최고 인덱스는 9)
		
		return stuAr.get(idx); 		// 인덱스에 맞는 요소를 반환.
	}								// 최고인덱스를 넘는 인덱스 요소가 반환된다면, 호출부에 예외가 발생할 것임. (트라이 캐치 필요)
	

	//	-> public void insertStudent(Student s)  //학생 입력 메소드
	public void insertStudent(Student s) {
		
		stuAr.add(s);		// 학생 추가
	}

	
	//	-> public void updateStudent(Student oldStudent, Student newStudent) // 학생 정보 변경 메소드
	public void updateStudent(Student oldStudent, Student newStudent) {
		
		try {
			boolean flag = false;		// 불린 신호
			
			for(int i=0; i<stuAr.size(); i++) {			// 사이즈만큼 돈다
				if(stuAr.get(i).equals(oldStudent)) {	// 오버라이딩된 equals 메소드로 객체 비교.
					stuAr.set(i, newStudent);			// 식별된 정보가 있다면 교체 실시
					flag = true;						// if문이 실행되지 않는다면(맞는 정보가 없다면) flag는 항상 false일 것
					break;
				}
			}
			if(!flag) throw new Exception();			// flag가 true로 변하지 않았다면 여기서 true가 될 것이고, 예외를 던짐
			
		} catch(Exception e) {
			System.out.println("입력하신 기존 학생 정보가 없습니다. 메인메뉴로 돌아갑니다.");
			return;
		}
		
		System.out.println("학생정보가 교체되었습니다.");
	}
	
	
	
	//	-> public void deleteStudent(int classNumber)  // 학생 정보 삭제 메소드
	public void deleteStudent(int classNumber) {
		
		for(int i=0; i<stuAr.size(); i++) {
			
			if(stuAr.get(i).getNo() == classNumber) {		// 입력받은 번호와 맞는 학번이 있으면 진행
				System.out.println("학생의 정보를 찾았습니다.");
				Student s = stuAr.get(i);
				System.out.printf("%d\t%s\t%d\t%s\t\t%.2f%n",
						s.getNo(), s.getName(), s.getAge(), s.getAddress(), s.getGrade());
				System.out.print("삭제를 진행하시겠습니까? (진행 희망시 y 입력) : ");
				char yn = sc.next().charAt(0);
				
				if(yn == 'y') {
					stuAr.remove(i);		// 최종 승인 떨어지면 삭제 진행
					break;
				}
				else {
					System.out.println("취소 되었습니다. 메인 메뉴로 돌아갑니다.");
					return;
				}
			} else if((i == stuAr.size()) && (stuAr.get(i).getNo() != classNumber)) {
				System.out.println("학생 정보를 찾을 수 없습니다. 메인메뉴로 돌아갑니다.");
				return;			// 바깥 if문의 연장. 역시 인덱스 끝까지 돌 동안 맞는 번호가 없다면 메뉴로 돌아감.
			}
		}
		System.out.println("삭제를 성공적으로 진행했습니다.");
	}		// deleteStudent 괄호

}
