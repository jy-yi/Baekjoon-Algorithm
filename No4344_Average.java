import java.util.Scanner;
/**
 * ����� �Ѱ���
 * @author jy-yi
 * 
 * ���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. 
 * ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
 * 
 * ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
 * ��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����. 
 * ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
 * 
 * �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
 *
 */
public class No4344_Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int C = sc.nextInt();

		for (int i = 0; i < C; i++) {
			int student = sc.nextInt();
			int sum = 0;
			double count = 0;
			int[] score = new int[student];

			for (int j = 0; j < student; j++) {
				score[j] = sc.nextInt();
			}

			for (int k : score)
				sum += k;

			double avg = sum / student;

			for (int k : score) {
				if (k > avg)
					count++;
			}

			System.out.println(String.format("%.3f", count / student * 100) + "%");

		}
		sc.close();
	}
}
