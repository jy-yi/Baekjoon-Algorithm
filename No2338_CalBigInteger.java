import java.math.BigInteger;
import java.util.Scanner;

/**
 * ���ڸ� ���
 * @author jy-yi
 * 
 * �� �� A, B�� �Է¹޾�, A+B, A-B, A��B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
