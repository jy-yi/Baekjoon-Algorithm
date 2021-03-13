import java.util.Scanner;
/**
 * �߷�
 * @author jy-yi
 * 
 * ������ ������ �������� (� ���� ���ʴ�� ������ ���� ���ؼ� �̷������ ����) �� 2���� ���ڷ� ��Ÿ�� �� �ִ�. 
 * P�� ������ ù ��° ���̰�, Q�� �� �������� �Ǳ� ���� �ٷ� ���� ���� ���ؾ� �ϴ� ���̴�. ���� ��� P=1, Q=2 �̸� �� ���������� 1, 3, 5, 7, ..... �� �ȴ�.
 * 
 * ��� ������ ������ (� ������ ������ ���ʷ� ���� ���� ���Ͽ� ���� ����) �� ���������� ����ϰ� 2���� ���ڷ� ��Ÿ�� �� �ִ�. 
 * P�� ������ ù ��° ���̰�, Q�� �� �������� �Ǳ� ���� �ٷ� ���� ���� ���ؾ� �ϴ� ���̴�. ���� ��� P=3, Q=2�̸� �� �������� 3, 6, 12, ...�� �ȴ�.
 * 
 * �׵�� ���󿡼� ������ ���� �����ؼ� ���ϰ��� �� ������ ������������ ���������� ���Ѵ����� ���� ���� ���Ѵ�.
 * 
 * � ������ �־����� ��, �� ������ ��Ģ�� ������������, ���������� ������ �Ŀ�, ������ ������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No1731_Sequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		sc.close();
		
		boolean arithmetic = false; // �������� ����
		boolean geometric = false;  // ������ ����
		
		for (int i = 0; i < array.length - 2; i++) {
			if (array[i] - array[i+1] == array[i+1] - array[i+2]) {
				arithmetic = true;
			} else {
				arithmetic = false;
				break;
			}
		}
		
		for (int i = 0; i < array.length - 2; i++) {
			if (array[i+1] / array[i] == array[i+2] / array[i+1]) {
				geometric = true;
			} else {
				geometric = false;
				break;
			}
		}
		
		if (arithmetic) {
			System.out.println(array[n-1] + (array[1] - array[0]));
		} else {
			if (geometric)
				System.out.println(array[n-1] * (array[1] / array[0]));
		}
		
		
	}
}
