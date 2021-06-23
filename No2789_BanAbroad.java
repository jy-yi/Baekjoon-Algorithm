import java.util.Scanner;
/**
 * ���� ����
 * @author jy-yi
 * 
 * ���� �ָ� ������ �ִ� ���� ���� �ִ�. �� ���󿡼� ���� ���θ� ���ϴ� �л����� ��� �ٸ� ����� ������ ����. 
 * ���δ� �ְ��� �л����� �ڲ� ������ ���� ������ ã������ �ߴ�. ������, �л����� ������ ��� �޶��� ������ ��Ȯ�� ������ ã�� �� ������. 
 * ������ �������� �پ �л����� �ڲ� ������ ���� ������ �ſ� ������ �ߴ�.
 * 
 * ���� ���� �л����� ������ ���� ���б��� ������ ķ�긮�� ���б��̴�. ���δ� ���ͳ� �˿��� ���ؼ� �ؿܷ� ������ �̸����� ���� �� �Ϻθ� �����ϱ�� �ߴ�. 
 * �̸����� �� �ܾ� �߿��� CAMBRIDGE�� ���Ե� ���ĺ��� ��� ������ �ߴ�. 
 * ��, � �̸��Ͽ� LOVA�� �ܾ �ִٸ�, A�� CAMBRIDGE�� ���Ե� ���ĺ��̱� ������, �޾ƺ��� ����� LOV�� �޴´�.
 * 
 * �̷���, � �ܾ �־����� ��, �˿��� ��ģ �Ŀ��� � �ܾ �Ǵ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No2789_BanAbroad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		char[] cambridge = "CAMBRIDGE".toCharArray();

		for (int j = 0; j < cambridge.length; j++) {
			if (str.indexOf(cambridge[j]) > -1) {
				str = str.replaceAll(String.valueOf(cambridge[j]), "");
			}
		}

		System.out.println(str);
	}
}
