package ncs.test1;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		ArrayTest at = new ArrayTest();
		
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;	// 배열에 1~99 난수 배정
		}
		
		System.out.println("할당된 배열의 크기 : " + arr.length);
		System.out.print("array : "); at.print(arr);
		System.out.println();
		System.out.println("가장 큰 값 : " + at.max(arr));
		System.out.println("가장 작은 값 : " + at.min(arr));
		System.out.println("짝수의 갯수 : " + at.evenCount(arr));
		System.out.println("홀수의 갯수 : " + at.dooCount(arr));
		System.out.println("합계 : " + at.sum(arr));
		System.out.println("평균 : " + at.avg(arr));
	}
	
	//	+ sum(arr : int[]) : int 배열의 합계를 계산해서 리턴함
	public int sum(int[] arr) {
		
		int sum = 0;
		for(int s: arr) sum += s;			// arr의 모든 요소들을 sum에 더하고 있음
		return sum;
	}
	
	//	+ avg(arr : int[]) : double 배열의 평균을 계산해서 리턴함
	public double avg(int[] arr) {
		
		int sum = sum(arr);
		double avg = (int)(((double)sum)/arr.length*100)/100.0;		// 소수 2번째 자리까지 표시
		return avg;	
	}
	
	//	+ max(arr : int[]) : int 배열에서 가장 큰값을 찾아서 리턴
	public int max(int[] arr) {
		
		int best = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(best < arr[i]) best = arr[i];		// 기준 숫자보다 큰 숫자가 나타나면 기준숫자를 해당 숫자로 변경
		}
		return best;								// 다 돌고 가장 큰 값을 반환
	}
		
	//	+ min(arr : int[]) : int 배열에서 가장 작은값 찾아서 리턴
	public int min(int[] arr) {
		
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min > arr[i]) min = arr[i];			// 위와 동일. 작은 값이 나타나면 변경.
		}
		return min;
	}
		
	//	+ evenCount(arr : int[]) : int 배열에서 짝수의 개수를 리턴함
	public int evenCount(int[] arr) {
		
		int count = 0;
		for(int i : arr) {
			if(i%2 == 0) count++;
		}
		return count;
	}
	
	//	+ oddCount(arr : int[]) : int 배열에서 홀수의 개수를 리턴함
	public int dooCount(int[] arr) {
		
		int count = 0;
		for(int i : arr) {
			if(i%2 == 1) count++;
		}
		return count;
	}
	
	//	+ print(arr : int[]) : void
	public void print(int[] arr) {
		
		for(int s: arr) System.out.print(s + " ");
	}
	
}