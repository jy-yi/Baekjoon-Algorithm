import java.util.Scanner;
/**
 * ���� ����
 * @author jy-yi
 * 
 * ���Ѱ���б��� ���� ���� �α��̿� ������ 4����(����, ����, ����, ����)�� ���� ������ �ô�. 
 * �α��̿� ������ �� 4������ ������ �Է��ϸ�, �α����� ���� S�� ������ ���� T �߿��� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, ���� ������ ���� �α����� ���� S�� ����Ѵ�.
 *
 */
public class No5596_Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int minkook = 0, manse = 0;
		
		for (int i = 0; i < 4; i++) {
			minkook += sc.nextInt();
		}
		
		for (int i = 0; i < 4; i++) {
			manse += sc.nextInt();
		}
		
		sc.close();
		
		if (minkook == manse) System.out.println(minkook);
		else System.out.println(minkook > manse ? minkook : manse);
	}
}
