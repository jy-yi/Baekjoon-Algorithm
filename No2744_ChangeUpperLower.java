import java.util.Scanner;
/**
 * ��ҹ��� �ٲٱ�
 * @author jy-yi
 * 
 * ���� �ҹ��ڿ� �빮�ڷ� �̷���� �ܾ �Է¹��� ��, �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� �ٲپ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No2744_ChangeUpperLower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		sc.close();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if (Character.isUpperCase(c)) {
				System.out.print(String.valueOf(c).toLowerCase());
			} else {
				System.out.print(String.valueOf(c).toUpperCase());
			}
		}
	}
}
