import java.util.Scanner;
/**
 * ������ ��
 * @author jy-yi
 * 
 * ���� ��Ʈ���� ġ�� 1kg �� �缭 ������ ���ƿԽ��ϴ�.
 * �׷��� ���� �Ѵ��� �� ���� ������ �ͼ� A/B kg ��ŭ ���İ����ϴ�.
 * ������ ġ� ���� �� �� ���� ������ �ִ� ġ���� ���Դ� ���ΰ���?
 */
public class No16430_JerryAndTom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		sc.close();
		
		System.out.println((q-p) + " " + q);
	}
}
