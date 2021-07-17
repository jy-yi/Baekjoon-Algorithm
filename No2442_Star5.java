import java.util.Scanner;
/**
 * 별 찍기 - 5
 * @author jy-yi
 * 
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
 * 별은 가운데를 기준으로 대칭이어야 한다.
 *
 */
public class No2442_Star5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++)
				System.out.print(" ");
			for (int k = 0; k < 2 * i + 1; k++)
				System.out.print("*");
			System.out.println();
		}
	}
}
