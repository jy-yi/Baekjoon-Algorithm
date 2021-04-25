import java.util.Scanner;

/**
 * A+B - 6
 * @author jy-yi
 *
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
public class No10953_AB6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			String[] arr = s.split(",");
			
			int sum = 0;
			for (String str : arr) {
				sum += Integer.parseInt(str);
			}
			
			System.out.println(sum);
		}
		
		sc.close();
	}
}
