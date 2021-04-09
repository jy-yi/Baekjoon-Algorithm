import java.math.BigInteger;
import java.util.Scanner;
/**
 * 큰 수 A+B
 * @author jy-yi
 *
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
public class No10757_Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		sc.close();

		System.out.println(a.add(b));
		
	}
}
