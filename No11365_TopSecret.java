import java.util.Scanner;
/**
 * !�к� ����
 * @author jy-yi
 * 
 * ����� ���� ���ٰ� �̻��� ������ �߰��ߴ�. �� �������� ��ȣ�� ���� �־��µ�, �ȶ��� ����� ��ȣ�� �������� �ص��ȴٴ� ���� �߰��ߴ�.
 * �� ��ȣ�� �ص��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class No11365_TopSecret {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.nextLine();
			
			if ("END".equals(str)) break;
			
			System.out.println(new StringBuffer(str).reverse().toString());
		}
		
		sc.close();
	}
}
