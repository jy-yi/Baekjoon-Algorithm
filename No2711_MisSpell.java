import java.util.Scanner;

/**
 * ��Ÿ�� ��â��
 * @author jy-yi
 * 
 * ��â���� �ǳ� ��Ÿ�� ����. 
 * â���̰� ��Ÿ�� �� ����� ��Ÿ�� �� ��ġ�� �־����� ��, ��Ÿ�� ���� ���ڿ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * â���̴� ��Ÿ�� �ݵ�� 1���� ����.
 *
 */
public class No2711_MisSpell {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int index = sc.nextInt();
			String str = sc.next();
			
			System.out.println(new StringBuffer(str).deleteCharAt(index-1));
		}
		
		sc.close();
	}
}
