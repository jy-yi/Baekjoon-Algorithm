import java.util.Scanner;
/**
 * 0 = not cute / 1 = cute
 * @author jy-yi
 * 
 * ����� �ڱⰡ ������ �Ϳ����� ����ϰ� �ִٰ� �����Ѵ�.
 * ������ ������ �� �� �� �ǰ��� ���� �� �߸��� �� ���Ҵ�. �׷��⿡ �������縦 �Ͽ� ���� �Ϳ����� �ƴ��� �˾ƺ���� �ߴ�.
 * 
 */
public class No10886_Cute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int zeroCnt = 0, oneCnt = 0;
		
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			
			if (k == 0) zeroCnt++;
			else oneCnt++;
		}
		
		sc.close();
		
		if (oneCnt > zeroCnt) System.out.println("Junhee is cute!");
		else System.out.println("Junhee is not cute!");
	}
}
