package practice01;

import java.util.Scanner;

// 3의 배수인지 판별하는 프로그램
public class MultipleOfTree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수를 입력하시오 : ");
		int num = scanner.nextInt();
		
		if(num % 3 == 0){
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		scanner.close();
		
//		실행결과
//		수를 입력하시오 : 129
//		3의 배수입니다.
	}
}
