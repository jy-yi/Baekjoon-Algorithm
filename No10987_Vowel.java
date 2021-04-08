import java.util.Arrays;
import java.util.Scanner;
/**
 * ������ ����
 * @author jy-yi
 * 
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ �־�����. �̶�, ����(a, e, i, o, u)�� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No10987_Vowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();	// �Է� ���� ���ڿ�
		sc.close();

		int count = 0;
		String[] vowel = { "a", "e", "i", "o", "u" };	// ���� �迭

		for (int i = 0; i < str.length(); i++) {
			String s = str.substring(i, i+1);
			
			// ���� ���ڰ� �迭�� �����ϴ��� Ȯ��
			if (Arrays.stream(vowel).anyMatch(s::equals))
				count++;
		}
		
		System.out.println(count);
	}
}
