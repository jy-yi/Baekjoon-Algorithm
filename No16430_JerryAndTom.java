import java.util.Scanner;
/**
 * 제리와 톰
 * @author jy-yi
 * 
 * 톰은 마트에서 치즈 1kg 을 사서 집으로 돌아왔습니다.
 * 그런데 톰이 한눈을 판 사이 제리가 와서 A/B kg 만큼 훔쳐갔습니다.
 * 제리가 치즈를 훔쳐 간 후 톰이 가지고 있는 치즈의 무게는 얼마인가요?
 */
public class No16430_JerryAndTom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		sc.close();
		
		System.out.println((q-p) + " " + q);
	}
}
