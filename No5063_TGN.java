import java.util.Scanner;
/**
 * TGN
 * @author jy-yi
 * 
 * ����̴� TGN���� �����̴�. TGN�� Teenager Game Network�� ���� ������, ��� Temporary Group Name�� �����̴�.
 * �� ȸ��� û�ҳ��� ���� ���� ����� ȸ���̴�. �ϳ⿡ ��ģ ���߱Ⱓ ���� ���� ���� �ϼ��߰�, ���� �ȱ⸸ �ϸ� �ȴ�.
 * ����̴� ����Ʈ�� �ΰ��� �γ��� ������ �� ���� ������ ���� �Ѵ�. ���� ��û�� ����Ʈ ����� �ʿ��ϴ�. ����̴� ���� ������ �ؼ� ������ �ִ��� �ø����� �Ѵ�.
 * ��� �� �ϴ��� �ٶ󺸴� ����̴� �ø��콺�� ����� �ް� �Ǿ���, ���� ȿ���� �����ϴ� �ɷ��� ���� �Ǿ���.
 * ���� ȿ���� �־����� ��, ���� �ؾ����� ���ƾ����� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No5063_TGN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int r = sc.nextInt();	// ���� ���� �ʾ��� �� ����
			int e = sc.nextInt();	// ���� ���� ���� ����
			int c = sc.nextInt();	// ���� ���
			
			if (r > (e-c)) System.out.println("do not advertise");
			else if (r == (e-c)) System.out.println("does not matter");
			else System.out.println("advertise");
		}
		
		sc.close();
	}
}
