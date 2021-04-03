import java.util.Scanner;
/**
 * 완전제곱수
 * @author jy-yi
 * 
 * M과 N이 주어질 때 M이상 N이하의 자연수 중 완전제곱수인 것을 모두 골라 그 합을 구하고 그 중 최솟값을 찾는 프로그램을 작성하시오. 
 * 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 완전제곱수는 64, 81, 100 이렇게 총 3개가 있으므로 그 합은 245가 되고 이 중 최솟값은 64가 된다.
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
