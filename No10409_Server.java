import java.util.Scanner;
/**
 * ����
 * @author jy-yi
 * 
 * ����� FCFS(First-Come, First-Served)�� ��Ģ�� ���� ��û�� ���� ó���ϴ� ������ ����ϰ� �Ǿ���.
 * ����, ����� ���� ó���ϱ� ���� �ִ� T�� ���� ������ �ð��� �Ҵ��� �� �ִ�.
 * ����� ���� �־��� �ð����� ��� ���� �Ϸ�� �� �ִ��� �˰�ʹ�.
 * 
 * ���ø� ���ڴ�. T = 180�̰�, ��û�� �ϵ��� ����ð��� ��û�� ������ ���� 45, 30, 55, 20, 80, 20���̴�.
 * �׷���, �� 4���� �ϸ��� �Ϸ�� �� �ִ�.
 * 
 * ó�� 4���� ���� ����ð��� 150������ �־��� �ð� ���� �Ϸ�� �� ������,
 * ó�� 5���� ���� ����ð��� 230������ �־��� �ð� 180�к��� ũ�� ������ �Ϸ�� �� ����.
 * ó�� 4���� ���� ������ �� 6��°�� ���� �����ص� T�� �ʰ����� ������ 5��° ���� ������ �� ���� ������ 6��° ���� ������ �� ������ �����ض�.
 */
public class No10409_Server {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int T = sc.nextInt();

		int sum = 0;
		int count = 0;

		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();

			if (sum + t > T) {
				System.out.println(count);
				return;
			}

			sum += t;
			count++;
		}
		
		System.out.println(count);

		sc.close();
	}
}
