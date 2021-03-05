import java.util.Scanner;

/**
 * 하얀 칸
 * @author jy-yi
 *
 * 체스판은 8*8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다. 
 * 가장 왼쪽 위칸 (0,0)은 하얀색이다. 
 * 
 * 체스판의 상태가 주어졌을 때, 
 * 하얀 칸 위에 말이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 */
public class No1100_Chess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][] chess = new String[8][8];
		int count = 0;

		/* 입력 값에 맞게 배열에 저장 */
		for (int i = 0; i < chess.length; i++) {
			String s = sc.next();
			for (int j = 0; j < chess[i].length; j++) {
				chess[i][j] = s.substring(j, j+1);
			}
		}

		sc.close();

		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess[i].length; j++) {
				if ("F".equals(chess[i][j])) {
					// 하얀 칸 : 짝수 행 && 짝수 열
					if (i % 2 == 0 && j % 2 == 0) {
						count++;
					// 하얀 칸 : 홀수 행 && 홀수 열
					} else if (i % 2 == 1 && j % 2 == 1) {
						count++;
					}
				}
			}
		}

		System.out.println(count);
	}
}
