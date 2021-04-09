import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * �ܾ� ����
 * @author jy-yi
 * 
 * ���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 *   1. ���̰� ª�� �ͺ���
 *   2. ���̰� ������ ���� ������
 *
 */
public class No1181_WordSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Map<String, Integer> wordMap = new TreeMap<String, Integer>();	// key ���� �ڵ� �������� ���ĵǾ� ���ԵǴ� Ʈ��

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			wordMap.put(s, s.length()); // (�ܾ�, �ܾ����) ���·� Map�� ����
		}

		sc.close();

		List<String> keySetList = new ArrayList<String>(wordMap.keySet());
		
		/* value ���� ���� ���� ����*/
		Collections.sort(keySetList, (o1, o2) -> (wordMap.get(o1).compareTo(wordMap.get(o2))));
		
		for (String string : keySetList) {
			System.out.println(string);
		}

	}
}
