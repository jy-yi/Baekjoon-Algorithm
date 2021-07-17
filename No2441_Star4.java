import java.util.Scanner;
/**
 * 별 찍기 - 4
 * @author jy-yi
 * 
 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 */
public class No2441_Star4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < n; i++) {
			String str = "";
			for (int j = n; j > 0; j--) {
				if (j > i) {
					str += "*";
				} else {
					str = " " + str;
				}
			}
			System.out.println(str);
		}
	}
}
