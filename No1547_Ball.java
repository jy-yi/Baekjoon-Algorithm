import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * ��
 * @author jy-yi
 * 
 * �����̴� �� 3���� Ź�� ���� �Ϸķ� ������Ҵ�. ���� ��ȣ�� �� ���� �ź��� ������� 1��, 2�� 3���̰�, �����̴� �� ���� �̿��ؼ� ������ �Ϸ��� �Ѵ�.
 * ���� 1�� ���� �Ʒ��� ���� �ϳ� �ִ´�. �����̴� �� ���� �� ����, �� ��ġ�� �¹ٲٷ��� �Ѵ�. 
 * ���� ���, �� ���� 1���� 2���̶��, 1�� ���� �ִ� ��ġ�� 2�� ���� �̵���Ű��, ���ÿ� 2�� ���� �ִ� ��ġ�� 1�� ���� �̵����Ѿ� �Ѵ�. 
 * �̶� ���� �������� �ʱ� ������, ���� ��ġ�� �� ó�� 1�� ���� �ִ� ��ġ�� ����.
 * �����̴� ���� ��ġ�� �� M�� �ٲ� ���̸�, ���� ��ġ�� �ٲ� ����� �Է����� �־�����. ��ġ�� M�� �ٲ� ���Ŀ� ���� ����ִ� ���� ��ȣ�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No1547_Ball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Map<Integer, Integer> cup = new HashMap<Integer, Integer>();
		cup.put(1, 1);
		cup.put(2, 2);
		cup.put(3, 3);

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			int tempKey = getKey(cup, y);
			cup.put(getKey(cup, x), y);
			cup.put(tempKey, x);
		}
		
		System.out.println(cup.get(1));

		sc.close();
	}

	/**
	 * value�� key �˻�
	 * @param cup
	 * @param value
	 * @return
	 */
	public static Integer getKey(Map<Integer, Integer> cup, Integer value) {
		for (Integer i : cup.keySet()) {
			if (cup.get(i).equals(value)) {
				return i;
			}
		}
		return null;
	}
}
