import java.util.Scanner;
/**
 * ������
 * @author jy-yi
 * 
 * �츮���� ������ �����̴� �� ���� ��¦�� ������ ��(0)�� ��(1)�� ������ ���ڸ� ���� ��, ��, ��, ��, �� �����Ѵ�.
 * �� �� ��¦�� ������ ���� �� ��¦�� �� Ȥ�� �� ������ �־��� �� 
 * ��(�� �� ��, �� �� ��), ��(�� �� ��, �� �� ��), ��(�� �� ��, �� �� ��), ��(�� �� ��), ��(�� �� ��) �� 
 * � �������� �����ϴ� ���α׷��� �ۼ��϶�.
 *
 */
public class No2490_YutPlay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			int zeroCount = 0;
			int oneCount = 0;
			for (int j = 0; j < 4; j++) {
				int tmp = sc.nextInt();
				
				if (tmp == 0) zeroCount++;
				else oneCount++;
			}
			
			if (zeroCount == 1 && oneCount == 3) System.out.println("A");
			else if (zeroCount == 2 && oneCount == 2) System.out.println("B");
			else if (zeroCount == 3 && oneCount == 1) System.out.println("C");
			else if (zeroCount == 4) System.out.println("D");
			else if (oneCount == 4) System.out.println("E");
			
		}
		
		sc.close();
	}
}
