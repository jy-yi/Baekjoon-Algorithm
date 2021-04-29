import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Ȧ��
 * @author jy-yi
 * 
 * 7���� �ڿ����� �־��� ��, �̵� �� Ȧ���� �ڿ������� ��� ��� �� ���� ���ϰ�, �� Ȧ���� �� �ּڰ��� ã�� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ���� ���, 7���� �ڿ��� 12, 77, 38, 41, 53, 92, 85�� �־����� �̵� �� Ȧ���� 77, 41, 53, 85�̹Ƿ� �� ����
 * 77 + 41 + 53 + 85 = 256 �� �ǰ�,
 * 41 < 53 < 77 < 85 �̹Ƿ� Ȧ���� �� �ּڰ��� 41�� �ȴ�.
 *
 */
public class No2576_OddNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		
		for (int i = 0; i < 7; i++) {
			int n = sc.nextInt();
			if (n % 2 == 1) {
				list.add(n);
				sum += n;
			}
		}
		
		sc.close();
		
		if (list.isEmpty()) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			Collections.sort(list);
			System.out.println(list.get(0));
		}
		
	}
}
