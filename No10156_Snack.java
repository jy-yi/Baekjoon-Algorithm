import java.util.Scanner;

/**
 * ����
 * @author jy-yi
 * 
 * ������ �������� ���ڸ� �緯 ���µ� ���� ���� ���� ���ڶ� ��� �θ�Բ� ���ڶ� ���� �������� �Ѵ�. 
 * ���� �� ���� ������ K, ����� �ϴ� ������ ������ N�̰�, ���� ���� ���� �׼��� M�̶� �� �� 
 * �������� ������ �θ�Բ� �޾ƾ� �ϴ� ���ڶ� ���� ����Ϸ��� �Ѵ�.
 * 
 * ���� �� ���� ����, ����� �ϴ� ������ ������ ������ ���� ���� ���� �׼��� �־��� �� 
 * ������ �θ�Բ� �޾ƾ� �ϴ� ���� �׼��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No10156_Snack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt(); // ���� �� �� ����
		int n = sc.nextInt(); // ����� �ϴ� ���� ����
		int m = sc.nextInt(); // ������ ���� ��
		
		int money = k * n - m;
		
		sc.close();
		
		System.out.println(money > 0 ? money : 0);
	}
}
