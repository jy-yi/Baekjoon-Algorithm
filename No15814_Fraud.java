import java.util.Scanner;
/**
 * 야바위 대장
 * @author jy-yi
 * 
 * 10년 동안 도박판에서 야바위를 한 영훈은 이제 보지 않고도 구슬이 있는 컵을 맞추는 지경에 이르렀다.
 * 이런 영훈을 골탕 먹이기 위해 문자열로 야바위를 하려고 한다.
 * T번 동안 문자열 S의 A번째 위치에 있는 문자와 B번째 위치에 있는 문자를 바꾼 결과를 출력하는 프로그램을 작성하시오
 *
 */
public class No15814_Fraud {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int t = sc.nextInt();
		
		char[] array = s.toCharArray();
		
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			char temp = array[a];
			array[a] = array[b];
			array[b] = temp;
		}
		
		sc.close();
		
		for (char c : array) {
			System.out.print(c);
		}
		
	}
}
