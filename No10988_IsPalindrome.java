import java.util.Scanner;
/**
 * �Ӹ�������� Ȯ���ϱ�
 * @author jy-yi
 * 
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ �־�����. �̶�, �� �ܾ �Ӹ�������� �ƴ��� Ȯ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Ӹ�����̶� ������ ���� ���� �Ųٷ� ���� �� �Ȱ��� �ܾ ���Ѵ�. 
 * level, noon�� �Ӹ�����̰�, baekjoon, online, judge�� �Ӹ������ �ƴϴ�.
 *
 */
public class No10988_IsPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		if (str.equals(new StringBuffer(str).reverse().toString())) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
