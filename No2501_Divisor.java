import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 약수 구하기
 * @author jy-yi
 * 
 * 어떤 자연수 p와 q가 있을 때, 만일 p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수이다. 
 * 두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오.
 */
public class No2501_Divisor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		sc.close();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				list.add(i);
		}
		
		if (list.size() >= k) {
			System.out.println(list.get(k-1));
		} else {
			System.out.println(0);
		}
	}
}
