import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ���� ���
 * @author jy-yi
 * 
 * � ����� C��� ������ �־����� ��, ������ �� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * A+: 4.3, A0: 4.0, A-: 3.7
 * B+: 3.3, B0: 3.0, B-: 2.7
 * C+: 2.3, C0: 2.0, C-: 1.7
 * D+: 1.3, D0: 1.0, D-: 0.7
 * F: 0.0
 */
public class No2754_CalGrade {
	public static void main(String[] args) {
		Map<String, Double> score = new HashMap<String, Double>();
		score.put("A+", 4.3);
		score.put("A0", 4.0);
		score.put("A-", 3.7);
		score.put("B+", 3.3);
		score.put("B0", 3.0);
		score.put("B-", 2.7);
		score.put("C+", 2.3);
		score.put("C0", 2.0);
		score.put("C-", 1.7);
		score.put("D+", 1.3);
		score.put("D0", 1.0);
		score.put("D-", 0.7);
		score.put("F", 0.0);
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		System.out.println(score.get(s));
	}
}
