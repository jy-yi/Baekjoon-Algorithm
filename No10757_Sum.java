import java.math.BigInteger;
import java.util.Scanner;
/**
 * ū �� A+B
 * @author jy-yi
 *
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
