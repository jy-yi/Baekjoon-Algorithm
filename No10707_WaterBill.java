import java.util.Scanner;
/**
 * �������
 * @author jy-yi
 * 
 * JOI���� ��� �ִ� �������� X��� Y��, �� ���� ����ȸ�簡 �ִ�. �� ȸ���� ��������� �� �ް� ������ ��뷮�� ���� ������ ���� ��������.
 * 
 * X�� : 1���ʹ� A��.
 * Y�� : �⺻����� B���̰�, ��뷮�� C���� ���϶�� ����� �⺻��ݸ� û���ȴ�. ��뷮�� C���Ͱ� �Ѿ��� ��� �⺻��� B���� ���ؼ� �߰������ �ٴ´�. 
 * 		 �߰������ ��뷮�� C���͸� �Ѿ��� ��� 1���͸� �Ѿ��� ������ D���̴�.
 * 
 * JOI���� ������ �� �ް� ���� ������ ���� P�����̴�.
 * 
 * ��������� �ִ��� �ΰ� �ǵ��� ����ȸ�縦 �� ��, JOI���� ���� 1�ް� ��������� ���Ͽ���.
 *
 */
public class No10707_WaterBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int standardY = sc.nextInt();
		int extraCharge = sc.nextInt();
		int JOI = sc.nextInt();

		sc.close();
		
		int a = X * JOI;
		int b = 0;
		
		if (standardY >= JOI) {
			b = Y;
		} else {
			b = Y + (JOI - standardY) * extraCharge;
		}
		
		System.out.println(a < b ? a : b);
		
	}
}
