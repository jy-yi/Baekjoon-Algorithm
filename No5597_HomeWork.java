import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ���� �� ���� ��..?
 * @author jy-yi
 * 
 * X���� M�������� ���α׷��� ������ �ð� �ֽ��ϴ�. 
 * ���ǿ� �л��� 30���� �ִµ�, �л� ��ο� �� �л����� 1������ 30������ �⼮��ȣ�� �پ� �ֽ��ϴ�.
 * �������� ���� Ư�������� 28���� �����ߴµ�, �� �߿��� ���� �� �� �л� 2���� �⼮��ȣ�� ���ϴ� ���α׷��� �ۼ��ϼ���.
 *
 */
public class No5597_HomeWork {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> allStudent = new ArrayList<Integer>();
		
		/* ���� ������ �л� ����Ʈ */
		for (int i = 0; i < 28; i++) {
			list.add(sc.nextInt());
		}
		sc.close();
		
		/* 1~30�������� �л� */
		for (int i = 1; i <= 30; i++) {
			allStudent.add(i);
		}
		
		allStudent.removeAll(list);	// ��ü �л����� ���� ������ �л� ����
		
		for (Integer integer : allStudent) {
			System.out.println(integer);
		}
		
	}
}
