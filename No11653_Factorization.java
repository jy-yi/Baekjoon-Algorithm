import java.util.Scanner;
/**
 * ���μ����� (�������׳׽��� ü)
 * @author jy-yi
 * 
 * ���� N�� �־����� ��, ���μ������ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No11653_Factorization {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		// N�� 1�� ��� �ƹ��͵� ��� X
		if (n == 1)
			return;
		
		/* START: 1���� n���� �Ҽ� �Ǻ� */
		boolean[] primeNum = new boolean[n+1];
		
		for (int i = 2; i <= n; i++) {
			primeNum[i] = true;
		}
		
		for (int i = 2; i <= n; i++) {
			for (int j = i*i; j <= n; j+= i) {
				primeNum[j] = false;
			}
		}
		/* END: 1���� n���� �Ҽ� �Ǻ� */
		
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
