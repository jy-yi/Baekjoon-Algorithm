import java.util.Scanner;

/**
 * ������
 * @author jy-yi
 * 
 * �� �б⸦ �¾� ����̴� å�� 10�� �����ߴ�. ����̴� �ǿ��� �ʹ� �ռ��� ������ �������� �ʰ� å�� �����ߴ�. ���� �� å�� ������ �˾ƺ����� �Ѵ�.
 * ������, ���������� ����� �����־���, ����̴� å 10�� �� 9���� ���ݸ� ���� �� �־���.
 * 
 * å 10���� �� ���ݰ� ������ ���� �� �ִ� 9�� ������ �־����� ��, ������ ���� �� ���� å�� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No5565_Receipt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i < 9; i++) {
			sum += sc.nextInt();
		}
		
		sc.close();
		
		System.out.println(price - sum);
	}
}
