import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * �α����� ��й�ȣ
 * @author jy-yi
 * 
 * â���̴� �α����� ��ǻ�͸� ��ŷ�� �ؽ�Ʈ ���� �ϳ��� �ڽ��� ���Ϸ� �����ߴ�. 
 * ���Ͽ��� �ܾ �� �ٿ� �ϳ��� �����־���, �� �� �ϳ��� �α��̰� �¶��� �������� ����ϴ� ��й�ȣ�̴�.
 * 
 * ������ ���캸�� â���̴� ��� �ܾ��� ���̰� Ȧ����� ����� �˾Ƴ�����. 
 * �׸��� ������ �α��̰� �� ��Ͽ� ���ؼ� ����ߴ� ���� �����س´�. 
 * �α����� ��й�ȣ�� ��Ͽ� ���ԵǾ� ������, ��й�ȣ�� ����� �� ���ڿ��� ���ԵǾ� �ִ�.
 * 
 * ���� ���, �α����� ��й�ȣ�� "tulipan"�� ��쿡 ��Ͽ��� "napilut"�� �����ؾ� �Ѵ�. �� �� ���� ������ ���� ��� ��й�ȣ�� ��� �����ϴٰ� �Ѵ�.
 * 
 * �α����� ���Ͽ� �����ִ� �ܾ ��� �־����� ��, ��й�ȣ�� ���̿� ��� ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class No9933_Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		List<String> password = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			password.add(sc.nextLine());
		}

		sc.close();

		for (int i = 0; i < password.size(); i++) {
			String s = new StringBuffer(password.get(i)).reverse().toString();
			if (password.contains(s)) {
				System.out.println(s.length() + " " + s.charAt(s.length() / 2));
				return;
			}
		}
	}
}
