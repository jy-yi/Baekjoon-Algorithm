import java.util.Scanner;
/**
 * ��?
 * @author jy-yi
 * 
 * �غ��̴� �б��� �ٴϸ鼭 ƴƴ�� �� ������ �ڵ����� ����� �Ѵ�. �ڵ����� ���� ���� �ɼ��� ���Խ�ų �� �ִµ� �غ��̴� ������ ������ ���� ���ϱ� ������ ģ�� �¿��̿��� ������ û�ߴ�. 
 * ������ �¿��̵� ������ ������ ���Ѵ�. �ҽ��� �� �� ģ���� ���� ��� �ɼ��� �־��� �ڵ����� �����ϴµ� �ʿ��� �׼��� ����� ����.
 *
 */
public class No9325_HowMuch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] price = new int[n];
		
		for (int i = 0; i < n; i++) {
			int s = sc.nextInt();
			
			int t = sc.nextInt();
			
			for (int j = 0; j < t; j++) {
				int q = sc.nextInt();
				int p = sc.nextInt();
				
				s += (q * p);
			}
			
			price[i] = s;
		}
		
		for (int i : price) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
