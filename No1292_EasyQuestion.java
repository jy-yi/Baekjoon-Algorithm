import java.util.Scanner;
/**
 * ���� Ǫ�� ����
 * @author jy-yi
 * 
 * ��ȣ�� ���⿡ �ʵ��б��� �����Ѵ�. �׷��� ��ȣ ��Ӵϴ� ���� ���� �н��� ���� ���� Ǫ�� ������ ��ȣ���� �־���.
 * �� ������ ������ ����. 1�� �� ��, 2�� �� ��, 3�� �� ��, �̷� ������ 1 2 2 3 3 3 4 4 4 4 5 .. �̷��� ������ ����� ��� ������ ������ �ָ� �� ������ ���� ���ϴ� ���̴�.
 * ������ ��ȣ�� ���� �� ����� ������ Ǫ���� �ٻڱ⿡ �츮�� ��ȣ�� ��������.
 *
 */
public class No1292_EasyQuestion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		sc.close();

		int[] array = new int[b];
		int index = 0;

		for (int i = 1; i <= b; i++) {
			for (int j = 0; j < i; j++) {
				if (index == b) break;
				array[index++] = i;
			}
		}

		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += array[i - 1];
		}

		System.out.println(sum);
	}
}
