import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 민균이의 비밀번호
 * @author jy-yi
 * 
 * 창영이는 민균이의 컴퓨터를 해킹해 텍스트 파일 하나를 자신의 메일로 전송했다. 
 * 파일에는 단어가 한 줄에 하나씩 적혀있었고, 이 중 하나는 민균이가 온라인 저지에서 사용하는 비밀번호이다.
 * 
 * 파일을 살펴보던 창영이는 모든 단어의 길이가 홀수라는 사실을 알아내었다. 
 * 그리고 언젠가 민균이가 이 목록에 대해서 얘기했던 것을 생각해냈다. 
 * 민균이의 비밀번호는 목록에 포함되어 있으며, 비밀번호를 뒤집어서 쓴 문자열도 포함되어 있다.
 * 
 * 예를 들어, 민균이의 비밀번호가 "tulipan"인 경우에 목록에는 "napilut"도 존재해야 한다. 알 수 없는 이유에 의해 모두 비밀번호로 사용 가능하다고 한다.
 * 
 * 민균이의 파일에 적혀있는 단어가 모두 주어졌을 때, 비밀번호의 길이와 가운데 글자를 출력하는 프로그램을 작성하시오.
 */
public class No9933_Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		List<String> password = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			password.add(sc.nextLine());
		}

		sc.close();

		for (int i = 0; i < password.size(); i++) {
			String s = new StringBuffer(password.get(i)).reverse().toString();
			if (password.contains(s)) {
				System.out.println(s.length() + " " + s.charAt(s.length() / 2));
				return;
			}
		}
	}
}
