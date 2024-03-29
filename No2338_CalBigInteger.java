import java.math.BigInteger;
import java.util.Scanner;

/**
 * 긴자리 계산
 * @author jy-yi
 * 
 * 두 수 A, B를 입력받아, A+B, A-B, A×B를 구하는 프로그램을 작성하시오.
 *
 */
public class No2338_CalBigInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();

		sc.close();
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		
	}
}
