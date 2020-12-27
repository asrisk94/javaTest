package workshop5;

public class Test03 {

	public static void main(String[] args) {
		
		int[][] arr2 = {{20, 30, 10}, {50, 40, 60}, {80, 80, 90}};	// 2차원 배열
		
		for(int i=arr2.length-1; i>=0; i--) {					// 역순 인덱스
			for(int j=arr2[i].length-1; j>=0; j--) {			// 역순 인덱스
				
				System.out.print(arr2[i][j] + " ");				// 인덱스가 모두 역순이므로 역순서로 한 칸씩 띄워서 출력
			}
		}
	}

}
