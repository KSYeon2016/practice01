package practice01;

public class Prob2 {	// 이중 for문 사용

	public static void main(String[] args) {
		for(int i = 0; i < 8; i++){
			for(int j = 1; j <= 10; j++){
				System.out.print(j+i + " ");
			}
			System.out.println();
		}
		
//		실행 결과: 
//			1 2 3 4 5 6 7 8 9 10
//			2 3 4 5 6 7 8 9 10 11
//			3 4 5 6 7 8 9 10 11 12
//			4 5 6 7 8 9 10 11 12 13
//			5 6 7 8 9 10 11 12 13 14
//			6 7 8 9 10 11 12 13 14 15
//			7 8 9 10 11 12 13 14 15 16
//			8 9 10 11 12 13 14 15 16 17
	}

}
