import java.util.Scanner;
/**
 * 소인수분해 (에라스토테네스의 체)
 * @author jy-yi
 * 
 * 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
 *
 */
public class No11653_Factorization {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		// N이 1인 경우 아무것도 출력 X
		if (n == 1)
			return;
		
		/* START: 1부터 n까지 소수 판별 */
		boolean[] primeNum = new boolean[n+1];
		
		for (int i = 2; i <= n; i++) {
			primeNum[i] = true;
		}
		
		for (int i = 2; i <= n; i++) {
			for (int j = i*i; j <= n; j+= i) {
				primeNum[j] = false;
			}
		}
		/* END: 1부터 n까지 소수 판별 */
		
		int i = 0;
		while (n > 1) {
			if (primeNum[i]) {
				if (n % i == 0) {
					System.out.println(i);
					n /= i;
				} else {
					i++;
				}
			} else {
				i++;
			}
		}
	}
}
