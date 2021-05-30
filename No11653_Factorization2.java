import java.util.Scanner;
/**
 * 소인수분해
 * @author jy-yi
 * 
 * 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
 *
 */
public class No11653_Factorization2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		// N이 1인 경우 아무것도 출력 X
		if (n == 1)
			return;
		
		int i = 2;
		while (n >= i) {
			if (n % i == 0) {
				System.out.println(i);
				n /= i;
			} else {
				i++;
			}
		}
		
		
	}
}
