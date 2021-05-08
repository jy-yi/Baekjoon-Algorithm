import java.util.Scanner;
import java.util.Stack;
/**
 * ����
 * @author jy-yi
 * 
 * ���ڴ� ���� ����̴� ���Ƹ� ȸ���� �غ��ϱ� ���ؼ� ��θ� �����ϴ� ���̴�.
 * �����̴� ����̸� ���ͼ� ���� �����ϴ� ���ε�, �ּ��ϰԵ� �׻� ���ž��� �����̴� ���� �Ǽ��� �߸� �θ��� ��� ġ�� �Ͼ�����.
 * �����̴� �߸��� ���� �θ� ������ 0�� ���ļ�, ���� �ֱٿ� ����̰� �� ���� ����� ��Ų��.
 * ����̴� �̷��� ��� ���� �޾� ���� �� �� ���� ���� �˰� �;� �Ѵ�. ����̸� ��������!
 *
 */
public class No10773_Zero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < K; i++) {
			int n = sc.nextInt();
			if (n == 0) {
				stack.pop();
			} else {
				stack.add(n);
			}
		}

		sc.close();

		int sum = 0;
		for (Integer integer : stack) {
			sum += integer;
		}

		System.out.println(sum);
	}
}
