import java.util.Scanner;
/**
 * ī�� ����
 * @author jy-yi
 * 
 * JOI���� ī�� ������ �ϰ� �ִ�. �� ī�� ������ 5ȸ�� �������� ����Ǹ�, �� �������� �ºθ� �ϴ� �����̴�.
 * JOI���� �� ������ ������ ��Ÿ���� ������ �־����� ��, JOI���� ������ ���ϴ� ���α׷��� �ۼ��϶�.
 *
 */
public class No5522_CardGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			sum += sc.nextInt();
		}
		sc.close();
		
		System.out.println(sum);
	}
}
