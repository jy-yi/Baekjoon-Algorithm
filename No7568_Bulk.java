import java.util.Scanner;
/**
 * ��ġ
 * @author jy-yi
 * 
 * �츮�� ����� ��ġ�� Ű�� ������, �� �� ���� ������ ǥ���Ͽ� �� ����� �Űܺ����� �Ѵ�. 
 * � ����� �����԰� x kg�̰� Ű�� y cm��� �� ����� ��ġ�� (x, y)�� ǥ�õȴ�. 
 * �� ��� A �� B�� ��ġ�� ���� (x, y), (p, q)��� �� �� x > p �׸��� y > q �̶�� �츮�� A�� ��ġ�� B�� ��ġ���� "�� ũ��"�� ���Ѵ�. 
 * ���� ��� � A, B �� ����� ��ġ�� ���� (56, 177), (45, 165) ��� �Ѵٸ� A�� ��ġ�� B���� ū ���� �ȴ�. 
 * �׷��� ���� �ٸ� ��ġ���� ũ�⸦ ���� �� ���� ��쵵 �ִ�. 
 * 
 * ���� ��� �� ��� C�� D�� ��ġ�� ���� (45, 181), (55, 173)�̶�� �����Դ� D�� C���� �� ���̰�, 
 * Ű�� C�� �� ũ�Ƿ�, "��ġ"�θ� �� �� C�� D�� ������ ���溸�� �� ũ�ٰ� ���� �� ����.
 * 
 * N���� ���ܿ��� �� ����� ��ġ ����� �ڽź��� �� "ū ��ġ"�� ����� ���� ��������. 
 * ���� �ڽź��� �� ū ��ġ�� ����� k���̶�� �� ����� ��ġ ����� k+1�� �ȴ�.
 * 
 * �������� �л� N���� �����Կ� Ű�� ��� �Է��� �о �� ����� ��ġ ����� ����Ͽ� ����ؾ� �Ѵ�.
 *
 */
public class No7568_Bulk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] people = new int[n][2];
		
		for (int i = 0; i < people.length; i++) {
			for (int j = 0; j < 2; j++) {
				people[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		for (int i = 0; i < people.length; i++) {
			int rank = 1;
			
			for (int j = 0; j < people.length; j++) {
				if (i == j) continue;
				
				if (people[i][0] < people[j][0] && people[i][1] < people[j][1])
					rank++;
			}
			
			System.out.print(rank + " ");
		}
	}
}
