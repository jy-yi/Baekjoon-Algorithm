import java.util.Scanner;

/**
 * A+B - 6
 * @author jy-yi
 *
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class No10953_AB6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			String[] arr = s.split(",");
			
			int sum = 0;
			for (String str : arr) {
				sum += Integer.parseInt(str);
			}
			
			System.out.println(sum);
		}
		
		sc.close();
	}
}
