import java.util.Scanner;
/**
 * �ܾ� ������
 * @author jy-yi
 * 
 * ������ �־����� ��, �ܾ ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, �ܾ��� ������ �ٲ� �� ����. �ܾ�� ���� ���ĺ����θ� �̷���� �ִ�.
 *
 */
public class No9093_ReverseWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String[] array = str.split(" ");

			for (int j = 0; j < array.length; j++) {
				System.out.print(new StringBuffer(array[j]).reverse().toString() + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
