import java.util.Arrays;
import java.util.Scanner;
/**
 * ���
 * @author jy-yi
 * 
 * ��� A�� N�� ��¥ ����� �Ƿ���, N�� A�� ����̰�, A�� 1�� N�� �ƴϾ�� �Ѵ�. 
 * � �� N�� ��¥ ����� ��� �־��� ��, N�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No1037_Divisor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] divisor = new int[N];
		
		for (int i = 0; i < divisor.length; i++) {
			divisor[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(divisor);
		
		System.out.println(divisor[0] * divisor[N-1]);
	}
}
