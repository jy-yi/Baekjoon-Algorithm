import java.util.Arrays;
import java.util.Scanner;

/**
 * ��ٳ���
 * @author jy-yi
 * 
 * ��ٳ��忡�� ���� �� �ȸ��� �޴��� ��Ʈ �޴��̴�. 
 * �ֹ��� ��, �ڽ��� ���ϴ� �ܹ��ſ� ���Ḧ �ϳ��� ���, ��Ʈ�� �����ϸ�, ������ �հ迡�� 50���� �� ������ ��Ʈ �޴��� ������ �ȴ�.
 * 
 * �ܹ��Ŵ� �� 3���� �������, �ߴ�����, �ϴ����Ű� �ְ�, ����� �ݶ�� ���̴� �� ������ �ִ�.
 * 
 * �ܹ��ſ� ������ ������ �־����� ��, ���� �� ��Ʈ �޴��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class No5543_McDonald {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] burger = new int[3];
		int[] drink = new int[2];
		
		/* �ܹ��� ���� */
		for (int i = 0; i < burger.length; i++) {
			burger[i] = sc.nextInt();
		}
		
		/* ����� ���� */
		for (int i = 0; i < drink.length; i++) {
			drink[i] = sc.nextInt();
		}
		
		sc.close();
		
		/* ���� �������� ���� */
		Arrays.sort(burger);
		Arrays.sort(drink);
		
		System.out.println(burger[0] + drink[0] - 50);
	}
}
