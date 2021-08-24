import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * ���̼� ����
 * @author jy-yi
 * 
 * �¶��� ������ ������ ������� ���̿� �̸��� ������ ������� �־�����. 
 * �̶�, ȸ������ ���̰� �����ϴ� ������, ���̰� ������ ���� ������ ����� �տ� ���� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No10814_SortByAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[][] array = new String[n][2];
		
		for (int i = 0; i < n; i++) {
			array[i][0] = sc.next();
			array[i][1] = sc.next();
		}
		
		sc.close();
		
		Arrays.sort(array, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
		
		for (int i = 0; i < n; i++) {
			System.out.println(array[i][0] + " " + array[i][1]);
		}
		
	}
}
