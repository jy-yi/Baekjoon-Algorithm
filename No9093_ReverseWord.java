import java.util.Scanner;
/**
 * 단어 뒤집기
 * @author jy-yi
 * 
 * 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 
 * 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
 *
 */
public class No9093_ReverseWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String[] array = str.split(" ");

			for (int j = 0; j < array.length; j++) {
				System.out.print(new StringBuffer(array[j]).reverse().toString() + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
