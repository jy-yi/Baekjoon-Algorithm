import java.util.Scanner;
/**
 * �� ���� ���� ����ϱ�
 * @author jy-yi
 * 
 * ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.
 * �� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No11721_Slice10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		while (true) {
			if (str.length() >= 10) {
				System.out.println(str.substring(0, 10));
			} else {
				System.out.println(str);
				break;
			}
			str = str.substring(10);
		}

	}
}
