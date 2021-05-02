import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 접미사 배열
 * @author jy-yi
 * 
 * 접미사 배열은 문자열 S의 모든 접미사를 사전순으로 정렬해 놓은 배열이다.
 * baekjoon의 접미사는 baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n 으로 총 8가지가 있고, 
 * 이를 사전순으로 정렬하면, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon이 된다.
 * 
 * 문자열 S가 주어졌을 때, 모든 접미사를 사전순으로 정렬한 다음 출력하는 프로그램을 작성하시오.
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
