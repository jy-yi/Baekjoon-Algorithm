import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 * ����Ʈ����
 * @author jy-yi
 * 
 * �������� ž������ �����̴�. �������� ���뿡�� ����� �ϴ� �����̴�. 
 * �������� �׳� �ٹ��� ���� �Ŀ�, ���� �Ǹ��� å�� ������ ���鼭 ���� ���� �ȸ� å�� ������ ĥ�ǿ� ����� �ϵ� ���� �ϰ� �ִ�.
 * 
 * ���� �Ϸ� ���� �ȸ� å�� ������ �Է����� ������ ��, ���� ���� �ȸ� å�� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No1302_BestSeller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Map<String, Integer> book = new HashMap<String, Integer>();

		/* å ���� : �ȸ� ���� */
		for (int i = 0; i < n; i++) {
			String title = sc.next();
			book.put(title, book.getOrDefault(title, 0) + 1);
		}

		sc.close();

		List<String> titleList = new ArrayList<String>(book.keySet());

        // Value ���� �������� ����
        titleList.sort((o1, o2) -> book.get(o2) - book.get(o1));
        
        int max = book.get(titleList.get(0)); // ������������ ���������Ƿ� ù ��° value�� �ִ밪
        
        List<String> bestSeller = new ArrayList<String>();
        
        /* ����Ʈ ������ ���� ���� ��� */
        for (String s : titleList) {
			if (max == book.get(s)) {
				bestSeller.add(s);
			}
		}
        
        Collections.sort(bestSeller); // å ���� ���� ������ ����

        System.out.println(bestSeller.get(0)); // ���� ������ ���� �ռ��� ����
		
	}
}
