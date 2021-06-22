import java.util.Scanner;
/**
 * 크냐?
 * @author jy-yi
 * 
 * 두 양의 정수가 주어졌을 때, 첫 번째 수가 두 번째 수보다 큰지 구하는 프로그램을 작성하시오.
 *
 */
public class No4101_IsBig {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a == 0 && b == 0) break;
			
			String s = a > b ? "Yes" : "No";
			System.out.println(s);
		}
		
		sc.close();
	}
}
