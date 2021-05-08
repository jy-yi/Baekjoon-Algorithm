import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * �����佺�׳׽��� ü
 * @author jy-yi
 * 
 * �����佺�׳׽��� ü�� N���� �۰ų� ���� ��� �Ҽ��� ã�� ������ �˰����̴�.
 * 
 * �� �˰����� ������ ����.
 * 
 * 1. 2���� N���� ��� ������ ���´�.
 * 2. ���� ������ ���� �� �� ���� ���� ���� ã�´�. �̰��� P��� �ϰ�, �� ���� �Ҽ��̴�.
 * 3. P�� �����, ���� ������ ���� P�� ����� ũ�� ������� �����.
 * 4. ���� ��� ���� ������ �ʾҴٸ�, �ٽ� 2�� �ܰ�� ����.
 * 
 * N, K�� �־����� ��, K��° ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No2960_SieveofEratosthenes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		sc.close();

		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		
		for (int i = 2; i <= n; i++) {
			list.add(i);
		}

		while (true) {
			int i = list.get(0);
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j) % i == 0) {
					if (k-1 == count) {
						System.out.println(list.get(j));
						return;
					} else {
						list.remove(j);
						count++;
					}
				}
			}
		}
	}
}
