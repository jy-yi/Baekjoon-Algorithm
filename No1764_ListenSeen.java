import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * �躸��
 * @author jy-yi
 * 
 * �������� �赵 ���� ����� ��ܰ�, ���� ���� ����� ����� �־��� ��, 
 * �赵 ���� ���� ����� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No1764_ListenSeen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc .nextInt();
		int m = sc.nextInt();
		
		Set<String> notListen = new HashSet<String>();
		List<String> notSeen = new ArrayList<String>();
		
		/* �赵 ���� ��� */
		for (int i = 0; i < n; i++) {
			notListen.add(sc.next());
		}
		
		/* ���� ���� ��� */
		for (int i = 0; i < m; i++) {
			String s = sc.next();
			if (notListen.contains(s)) {
				notSeen.add(s);
			}
		}
		
		sc.close();
		
		Collections.sort(notSeen);	// ������ ����
		
		System.out.println(notSeen.size());
		for (String string : notSeen) {
			System.out.println(string);
		}
	}
}
