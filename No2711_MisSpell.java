import java.util.Scanner;

/**
 * 오타맨 고창영
 * @author jy-yi
 * 
 * 고창영은 맨날 오타를 낸다. 
 * 창영이가 오타를 낸 문장과 오타를 낸 위치가 주어졌을 때, 오타를 지운 문자열을 출력하는 프로그램을 작성하시오.
 * 창영이는 오타를 반드시 1개만 낸다.
 *
 */
public class No2711_MisSpell {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int index = sc.nextInt();
			String str = sc.next();
			
			System.out.println(new StringBuffer(str).deleteCharAt(index-1));
		}
		
		sc.close();
	}
}
