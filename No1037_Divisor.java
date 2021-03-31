import java.util.Arrays;
import java.util.Scanner;
/**
 * 약수
 * @author jy-yi
 * 
 * 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 
 * 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
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
