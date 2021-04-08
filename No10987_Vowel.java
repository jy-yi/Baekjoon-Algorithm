import java.util.Arrays;
import java.util.Scanner;
/**
 * 모음의 개수
 * @author jy-yi
 * 
 * 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 모음(a, e, i, o, u)의 개수를 출력하는 프로그램을 작성하시오.
 *
 */
public class No10987_Vowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();	// 입력 받은 문자열
		sc.close();

		int count = 0;
		String[] vowel = { "a", "e", "i", "o", "u" };	// 모음 배열

		for (int i = 0; i < str.length(); i++) {
			String s = str.substring(i, i+1);
			
			// 현재 문자가 배열에 존재하는지 확인
			if (Arrays.stream(vowel).anyMatch(s::equals))
				count++;
		}
		
		System.out.println(count);
	}
}
