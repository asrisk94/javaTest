package javaTest3.com.kh.function;

import java.util.Scanner;

public class Example {
	public void opSample() {
		
//		   국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언하고,
//		    각 점수를 키보드로 입력받고,
//		    합계(국어+영어+수학)와 평균(합계/3.0)을 계산하고,
//		    세 과목의 점수와 평균을 가지고 "합격" 출력
//		    합격의 조건 : 세 과목의 점수가 각각 40점이상이면서,
//		                평균이 60점 이상이면 합격, 
//		                아니면 "불합격" 출력
		int kor;
		int eng;
		int math;
		int total;
		double average;
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("국어점수 > ");
		kor = a.nextInt();
		System.out.print("영어점수 > ");
		eng = a.nextInt();
		System.out.print("수학점수 > ");
		math = a.nextInt();
		
		total = kor + eng + math;
		average = total/3;
		
		String b = (kor>=40 && eng>=40 && math>=40) && (average >= 60)? "합격": "불합격";
		System.out.println(b);

	}
	
	public void opSample2() {
//	    변수 선언하고, 키보드로 입력받은 값들을 변수에 기록하고
//	    변수값을 화면에 출력 확인함
//	    성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력처리함
		String gender;
		char gen;
		Scanner b = new Scanner(System.in);
		
		System.out.print("성별 (M / F) : ");
		gen = b.next().charAt(0);
		gender = (gen == 'M')?"남학생":"여학생";
		System.out.println(gender);
	}
	
	public void opSample3() {
//		  학생이름 (문자열)
//		    학년 (정수)
//		    반 (정수)
//		    번호 (정수)
//		    성별(M/F) (문자)    //문자열로 입력받은 후, 문자하나 분리해야 함
//		    성적 (실수)         //성적은 소수점 2자리까지 출력
//		 - 출력 예
//		    3학년 2반 24번 남학생 홍길동은 성적이 95.55이다.
		
		String studentName;
		int year;
		int clas;
		int num;
		double grade;
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("이름 > ");
		studentName = a.next();
		System.out.print("학년 > ");
		year = a.nextInt();
		System.out.print("반 > ");
		clas = a.nextInt();
		System.out.print("번호 > ");
		num = a.nextInt();
		System.out.print("성별(M/F) > ");
		char gen = a.next().charAt(0);
		String gender = (gen == 'M')?"남":"여";
		System.out.print("성적 > ");
		grade = a.nextDouble();
		
		System.out.printf("%s학년 %d반 %d번 %s학생 %s(은)는 성적이 %.2f이다.", 
				year, clas, num, gender, studentName, grade);
	}

}
