import java.util.Scanner;
/**
 * �� ��� - 4
 * @author jy-yi
 * 
 * ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ��� ����
 * ������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
 */
public class No2441_Star4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < n; i++) {
			String str = "";
			for (int j = n; j > 0; j--) {
				if (j > i) {
					str += "*";
				} else {
					str = " " + str;
				}
			}
			System.out.println(str);
		}
	}
}
