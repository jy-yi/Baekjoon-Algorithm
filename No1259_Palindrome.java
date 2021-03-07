import java.util.Scanner;

/**
 * �Ӹ���Ҽ�
 * @author jy-yi
 *
 * � �ܾ �ڿ������� �о �Ȱ��ٸ� �� �ܾ �Ӹ�����̶�� �Ѵ�. 'radar', 'sees'�� �Ӹ�����̴�.
 * 
 * ���� �Ӹ�������� ����� �� �ִ�. 
 * ���� ���ڵ��� �ڿ������� �о ���ٸ� �� ���� �Ӹ���Ҽ���. 
 * 121, 12421 ���� �Ӹ���Ҽ���. 
 * 123, 1231�� �ڿ������� ������ �ٸ��Ƿ� �Ӹ���Ҽ��� �ƴϴ�. 
 * 
 * ���� 10�� �Ӹ���Ҽ��� �ƴѵ�, �տ� ���ǹ��� 0�� �� �� �ִٸ� 010�� �Ǿ� �Ӹ���Ҽ��� ����� ���� ������, 
 * Ư���� �̹� ���������� ���ǹ��� 0�� �տ� �� �� ���ٰ� ����.
 */
public class No1259_Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = sc.nextInt();
			
			if (n == 0) {
				sc.close();
				return;
			}
			
			int original = n;
			int reverse = 0;
			
			while(n > 0) {
				reverse = reverse * 10 + n % 10;
				n /= 10;
			}
			
			if (original == reverse) System.out.println("yes");
			else System.out.println("no");
			
		}
		
	}
}
