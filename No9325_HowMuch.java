import java.util.Scanner;
/**
 * 얼마?
 * @author jy-yi
 * 
 * 해빈이는 학교를 다니면서 틈틈히 번 돈으로 자동차를 사려고 한다. 자동차에 여러 가지 옵션을 포함시킬 수 있는데 해빈이는 덧셈과 곱셈을 하지 못하기 때문에 친구 태완이에게 도움을 청했다. 
 * 하지만 태완이도 덧셈과 곱셈을 못한다. 불쌍한 이 두 친구를 위해 모든 옵션이 주어진 자동차를 구매하는데 필요한 액수를 계산해 주자.
 *
 */
public class No9325_HowMuch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] price = new int[n];
		
		for (int i = 0; i < n; i++) {
			int s = sc.nextInt();
			
			int t = sc.nextInt();
			
			for (int j = 0; j < t; j++) {
				int q = sc.nextInt();
				int p = sc.nextInt();
				
				s += (q * p);
			}
			
			price[i] = s;
		}
		
		for (int i : price) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
