import java.util.Scanner;
/**
 * ������
 * @author jy-yi
 * 
 * ��ǻ�͸� �����ϴ� ȸ���� KOI ���ڿ����� �����ϴ� ��ǻ�͸��� 6�ڸ��� ������ȣ�� �ű��. 
 * ������ȣ�� ó�� 5�ڸ����� 00000���� 99999������ �� �� �ϳ��� �־����� 6��° �ڸ����� �������� ����. 
 * �������� ������ȣ�� ó�� 5�ڸ��� ���� 5���� ���ڸ� ���� ������ ���� ���� 10���� ���� �������̴�.
 * 
 * ���� ��� ������ȣ�� ó�� 5�ڸ��� ���ڵ��� 04256�̸�, 
 * �� ���ڸ� ������ ������ �� 0+16+4+25+36 = 81 �� 10���� ���� �������� 1�� �������̴�.
 *
 */
public class No2475_ValidationNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			sum += Math.pow(sc.nextInt(), 2);
		}
		
		sc.close();
		
		System.out.println(sum % 10);
	}
}
