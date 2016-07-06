package practice01;

public class Game369 {	// 숫자를 String으로 보고 길이만큼 체크

	public static void main(String[] args) {
		// Numeric String > int : Integer.parseInt(String);
		// int -> String : String.valueOf(int);
		String jj = "";
		
		for(int num = 1; num <= 33; num++){	//숫자 몇까지 출력할 것인가
			String sNum = String.valueOf(num);	// int를 String으로
			
			for(int i = 0; i < sNum.length(); i++){	// String의 길이만큼 체크
				char c = sNum.charAt(i);
				if(c == '3' || c == '6' || c == '9'){
					jj = jj + "짝";
				}
			}

			if(jj != ""){	//결과 출력
				System.out.println(num + " " + jj);
			}
			jj = "";
		}
	}
}
