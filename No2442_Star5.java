import java.util.Scanner;
/**
 * �� ��� - 5
 * @author jy-yi
 * 
 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 3��, ..., N��° �ٿ��� �� 2��N-1���� ��� ����
 * ���� ����� �������� ��Ī�̾�� �Ѵ�.
 *
 */
public class No2442_Star5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++)
				System.out.print(" ");
			for (int k = 0; k < 2 * i + 1; k++)
				System.out.print("*");
			System.out.println();
		}
	}
}
