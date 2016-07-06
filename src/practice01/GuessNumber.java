package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	
	public static void main(String[] args) {	// 무한루프(보통 while) + break;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		boolean exit = false;
		while(true){	//다시 하는지 묻는 while문
			int number = random.nextInt(100)+1;
			int max = 100;
			int min = 1;
			int count = 1;
			
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			System.out.println("정답 : " + number);
			
			while(true){	// 게임 한 판의 while문
				System.out.print(count + ">>");
				int sNum = scanner.nextInt();
				
				if(number > sNum){
					System.out.println("더 높게");
					min = sNum;
					System.out.println(min + "-" + max);
				} else if(number < sNum){
					System.out.println("더 낮게");
					max = sNum;
					System.out.println(min + "-" + max);
				} else {
					System.out.println("맞았습니다.");
					break;
				}
				count = count + 1;
			}
			
			do{
				System.out.print("다시 하시겠습니까? (y/n) ");
				String answer = scanner.next();
				if(answer.equals("y")){	//객체는 메소드를 사용
					break;
				} else if (answer.equals("n")){
					System.out.println("게임을 종료합니다.");
					exit = true;
					break;
				}
			} while(true);
			
			if(exit == true){
				break;
			}
		}
		scanner.close();
	}
}