import java.util.Scanner;
/**
 * �� ��� - 2
 * @author jy-yi
 * 
 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
 * ������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
 */
public class No2439_Star2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < n; i++) {
			String str = "";
			for (int j = 0; j < n; j++) {
				if (j <= i) {
					str += "*";
				} else {
					str = " " + str;
				}
			}
			System.out.println(str);
		}
	}
}
