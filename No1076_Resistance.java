import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ����
 * @author jy-yi
 *
 * ���� ��ǰ���� ������ ����. ������ �� 3���� �̿��ؼ� �� ������ �� ������ ��Ÿ����.
 * ó�� �� 2���� ������ ���̰�, ������ ���� ���ؾ� �ϴ� ���̴�.
 */
public class No1076_Resistance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long answer = 0L;
		
		Map<String, Integer> colorMap = new HashMap<String, Integer>();
		colorMap.put("black", 0);
		colorMap.put("brown", 1);
		colorMap.put("red", 2);
		colorMap.put("orange", 3);
		colorMap.put("yellow", 4);
		colorMap.put("green", 5);
		colorMap.put("blue", 6);
		colorMap.put("violet", 7);
		colorMap.put("grey", 8);
		colorMap.put("white", 9);
		
		String temp = "";
		
		for (int i = 0; i < 3; i++) {
			String s = sc.nextLine();
			
			if (i == 2) {
				answer = (long) (Long.parseLong(temp) * Math.pow(10, colorMap.get(s)));
			} else {
				temp += colorMap.get(s);
			}
		}
		
		sc.close();
		
		System.out.println(answer);
	}
}
