import java.util.Scanner;
/**
 * �߹��� ����
 * @author jy-yi
 * 
 * 10�� ���� �����ǿ��� �߹����� �� ������ ���� ���� �ʰ� ������ �ִ� ���� ���ߴ� ���濡 �̸�����.
 * �̷� ������ ���� ���̱� ���� ���ڿ��� �߹����� �Ϸ��� �Ѵ�.
 * T�� ���� ���ڿ� S�� A��° ��ġ�� �ִ� ���ڿ� B��° ��ġ�� �ִ� ���ڸ� �ٲ� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 *
 */
public class No15814_Fraud {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int t = sc.nextInt();
		
		char[] array = s.toCharArray();
		
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			char temp = array[a];
			array[a] = array[b];
			array[b] = temp;
		}
		
		sc.close();
		
		for (char c : array) {
			System.out.print(c);
		}
		
	}
}
