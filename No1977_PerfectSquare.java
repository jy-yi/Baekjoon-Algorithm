import java.util.Scanner;
/**
 * ����������
 * @author jy-yi
 * 
 * M�� N�� �־��� �� M�̻� N������ �ڿ��� �� ������������ ���� ��� ��� �� ���� ���ϰ� �� �� �ּڰ��� ã�� ���α׷��� �ۼ��Ͻÿ�. 
 * ���� ��� M=60, N=100�� ��� 60�̻� 100������ �ڿ��� �� ������������ 64, 81, 100 �̷��� �� 3���� �����Ƿ� �� ���� 245�� �ǰ� �� �� �ּڰ��� 64�� �ȴ�.
 *
 */
public class No1977_PerfectSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		sc.close();
		
		int minSqrt = (int) Math.ceil(Math.sqrt(m));
		int sum = 0;
		
		for (int i = minSqrt; i <= Math.floor(Math.sqrt(n)); i++) {
			sum += Math.pow(i, 2);
		}
		
		if (sum > 0) {
			System.out.println(sum);
			System.out.println((int) Math.pow(minSqrt, 2));
		} else {
			System.out.println(-1);
		}
	}
}
