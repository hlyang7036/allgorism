package algorism_10;

public class Algorism_10 {
	
	/* 입력된 n의 갯수만큼 n행과 n열의 형태로 연속되는 수를 출력하시오 */
	
	public static void main(String[] args) {
		
		int inputNum = 5;
		
		int count = 1;
		for (int j = 1; j <=4; j++) {	// ex 행 2개 = 
			for (int i = 1; i <=5 ; i++) {	// ex 열 5개 ㅣㅣㅣㅣㅣ
				System.out.print(i);
				System.out.print(j);
				System.out.printf("%4d", count);
				System.out.print(" ");
				count ++;
			}
			System.out.println();
		}
		
	}

}
