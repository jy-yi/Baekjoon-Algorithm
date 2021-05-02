import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * ���̻� �迭
 * @author jy-yi
 * 
 * ���̻� �迭�� ���ڿ� S�� ��� ���̻縦 ���������� ������ ���� �迭�̴�.
 * baekjoon�� ���̻�� baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n ���� �� 8������ �ְ�, 
 * �̸� ���������� �����ϸ�, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon�� �ȴ�.
 * 
 * ���ڿ� S�� �־����� ��, ��� ���̻縦 ���������� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No11656_Suffix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		
		sc.close();
		
		List<String> list = new ArrayList<String>();
		
		for (int i = 0; i < S.length(); i++) {
			list.add(S.substring(i, S.length()));
		}
		
		Collections.sort(list);
		
		for (String string : list) {
			System.out.println(string);
		}
	}
}
