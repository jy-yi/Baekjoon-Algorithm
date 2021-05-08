import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * ���� �丮���
 * @author jy-yi
 * 
 * "���� �丮���"�� �ټ� �����ڵ��� ������ �丮 �Ƿ��� �˳��� Ƽ�� �����̴�. 
 * �� �����ڴ� �ڽ��ִ� ������ �ϳ��� ��������, ���� �ٸ� ����� ������ ������ �����ش�. ������ 1������ 5������ �ִ�.
 * �� �����ڰ� ���� ������ �ٸ� ����� ���� �� ������ ���̴�. �� ���� ����ڴ� ���� ���� ������ ���� ����� �ȴ�.
 * �� �����ڰ� ���� �� ������ �־����� ��, ����ڿ� ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No2953_Chef {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		/* �� �� ���� map�� ���� */
		// [1=18, 2=17, 3=18, 4=19, 5=17]
		for (int i = 1; i <= 5; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += sc.nextInt();
			}
			map.put(i, sum);
		}
		
		sc.close();
		
		/* value ���� �������� ���� */
		List<Integer> keySetList = new ArrayList<Integer>(map.keySet());
		Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		
		System.out.println(keySetList.get(0) + " " + map.get(keySetList.get(0)));
	}
}
