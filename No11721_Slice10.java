import java.util.Scanner;
/**
 * 열 개씩 끊어 출력하기
 * @author jy-yi
 * 
 * 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
 * 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
 *
 */
public class No11721_Slice10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		while (true) {
			if (str.length() >= 10) {
				System.out.println(str.substring(0, 10));
			} else {
				System.out.println(str);
				break;
			}
			str = str.substring(10);
		}

	}
}
