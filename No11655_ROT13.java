import java.util.Scanner;
/**
 * ROT13
 * @author jy-yi
 * 
 * ROT13�� ī�̻縣 ��ȣ�� �������� ���� ���ĺ��� 13���ھ� �о �����.
 * ���� ���, "Baekjoon Online Judge"�� ROT13���� ��ȣȭ�ϸ� "Onrxwbba Bayvar Whqtr"�� �ȴ�. 
 * 
 * ROT13���� ��ȣȭ�� ������ ���� �������� �ٲٷ��� ��ȣȭ�� ���ڿ��� �ٽ� ROT13�ϸ� �ȴ�. 
 * �տ��� ��ȣȭ�� ���ڿ� "Onrxwbba Bayvar Whqtr"�� �ٽ� ROT13�� �����ϸ� "Baekjoon Online Judge"�� �ȴ�.
 * 
 * ROT13�� ���ĺ� �빮�ڿ� �ҹ��ڿ��� ������ �� �ִ�. ���ĺ��� �ƴ� ���ڴ� ���� ���� �״�� ���� �־�� �Ѵ�. 
 * ���� ���, "One is 1"�� ROT13���� ��ȣȭ�ϸ� "Bar vf 1"�� �ȴ�.
 * 
 * ���ڿ��� �־����� ��, "ROT13"���� ��ȣȭ�� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No11655_ROT13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		char[] ch = str.toCharArray();
		
		for (char c : ch) {
			if (c >= 'A' && c <= 'Z') {
				c += 13;
				if (c > 'Z') {
					c -= 26;
				}
			} else if (c >= 'a' && c <= 'z') {
				c += 13;
				if (c > 'z') {
					c -= 26;
				}
			}
			System.out.print(c);
		}
	}
}
