import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * �� ���
 * @author jy-yi
 * 
 * ����̴� ���� ���迡�� ���� ������� �������� �ִ�. 
 * ó���� �״� �� ��⸦ �����ϴ� ����̾���. �󱸿� ���� ������ �׸� ���� �� ������, �ᱹ ����̴� ������ û���ϴ� ���� �����ߴ�. 
 * ����̵� ������ û���ϸ鼭 ������ �Ǳ� ���� �������� �ɷ��� �����س�����. ���簳 3���̸� ǳ���� ������ ����̴� ���� �������� �� ���� �ٰ����� �־���. 
 * ��� �� �׿��� ������ �� ���γ����� ������ ��ȸ�� ����� �Ǿ���. 
 * �״� ��û�� �������� �����ָ� ���� ���׿��� ����� �߰�, ���� ������ǥ���� ������ �Ǿ���.
 * 
 * ������ �Ϻ��� ������ǥ ģ�� ��Ⱑ �ִ� ���̴�. ����̴� ���� ��⿡ ���� ���� ����� �ۼ��ؾ� �Ѵ�.
 * ������ǥ���� ������ �� ���Ŀ� ����̴� �ſ� ����������. �״� ������ �̸��� ������� ���ϰ�, �� ������ �ɷµ� ���� ���Ѵ�. 
 * ����, ���� �������� ����ϱ� ���� �ϱ� ���� ���� ù ���ڰ� ���� ���� 5���� �����Ϸ��� �Ѵ�. 
 * ����, ���� ù ���ڰ� ���� ������ 5���� ���ٸ�, ����̴� ���� ���� ģ�� ��⸦ ����Ϸ��� �Ѵ�.
 * 
 * ����̴� ���� ��⸦ ���� ���� �� �ִ� ���� ù ���ڸ� ��� ���غ����� �Ѵ�.
 *
 */
public class No1159_BasketBall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Map<String, Integer> names = new TreeMap<String, Integer>(); // ������ ������ ���� TreeMap ����
		
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			names.put(name.substring(0, 1), names.getOrDefault(name.substring(0, 1), 0) + 1); // �������� �� ������ map�� ����
		}
		sc.close();
		
		List<String> keyList = new ArrayList<String>(names.keySet());
		boolean isOK = false;
		
		for (int i = 0; i < names.size(); i++) {
			int players = names.get(keyList.get(i));
			if (players >= 5) {
				System.out.print(keyList.get(i));
				isOK = true;
			}
		}
		
		/* ������ �� ���� ��� */
		if (!isOK) {
			System.out.println("PREDAJA");
		}
		
	}
}
