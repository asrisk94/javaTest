package school;

public class StudentTest {

	public static void main(String[] args) {
		
//		홍길동 15 171 81
//		한사람 13 183 72
//		임걱정 16 175 65
		
		Student[] stuArr = new Student[3];				// 객체배열 생성
		
		stuArr[0] = new Student("홍길동", 15, 171, 81);	// 입력
		stuArr[1] = new Student("한사람", 13, 183, 72);
		stuArr[2] = new Student("임걱정", 16, 175, 65);
		
		
		
		double ageAvg = 0;								// 평균을 위한 변수 생성
		double heightAvg = 0;
		double weightAvg = 0;
		
		System.out.println("이름\t나이\t신장\t몸무게");
		
		for(int i=0; i<stuArr.length; i++) {			// 인덱스 루프
			
			String name = stuArr[i].getName();			// 배열칸마다 속성자료 빼냄
			int age = stuArr[i].getAge();
			int height = stuArr[i].getHeight();
			int weight = stuArr[i].getWeight();
			
			ageAvg += age;								// 평균을 위해 더해줌
			heightAvg += height;
			weightAvg += weight;
			
			System.out.printf("%s\t%d\t%d\t%d%n", name, age, height, weight);
		}
		
		System.out.println();
		System.out.printf("나이의 평균 : %.1f%n", (ageAvg/3));
		System.out.printf("신장의 평균 : %.1f%n", (heightAvg/3));
		System.out.printf("몸무게의 평균 : %.1f%n", (weightAvg/3));
		
	}

}
