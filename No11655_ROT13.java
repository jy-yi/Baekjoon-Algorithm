import java.util.Scanner;
/**
 * ROT13
 * @author jy-yi
 * 
 * ROT13은 카이사르 암호의 일종으로 영어 알파벳을 13글자씩 밀어서 만든다.
 * 예를 들어, "Baekjoon Online Judge"를 ROT13으로 암호화하면 "Onrxwbba Bayvar Whqtr"가 된다. 
 * 
 * ROT13으로 암호화한 내용을 원래 내용으로 바꾸려면 암호화한 문자열을 다시 ROT13하면 된다. 
 * 앞에서 암호화한 문자열 "Onrxwbba Bayvar Whqtr"에 다시 ROT13을 적용하면 "Baekjoon Online Judge"가 된다.
 * 
 * ROT13은 알파벳 대문자와 소문자에만 적용할 수 있다. 알파벳이 아닌 글자는 원래 글자 그대로 남아 있어야 한다. 
 * 예를 들어, "One is 1"을 ROT13으로 암호화하면 "Bar vf 1"이 된다.
 * 
 * 문자열이 주어졌을 때, "ROT13"으로 암호화한 다음 출력하는 프로그램을 작성하시오.
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
