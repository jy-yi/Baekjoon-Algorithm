import java.math.BigInteger;
import java.util.Scanner;
/**
 * Ȧ���ϱ� ¦���ϱ�
 * @author jy-yi
 * 
 * ¦�� ���� ����� ���� Ȧ�� �ִٺ��� Ȧ���� �Ǻ��� �� �ִ� �ɷ��� �����. 
 * â���̴� ������ ���� ������� �� �ɷ��� �����غ��� �Ѵ�. 
 * â������ �ǽ��� ���� ���� �� ���� N���� Ȯ���ϱ�� ���ߴ�.
 * 
 * N���� ������ �־����� Ȧ������ ¦�������� ����ϴ� ���α׷��� ����� ������ �ɷ��� ������ �� �ְ� ��������.
 *
 */
public class No5988_EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			BigInteger k = sc.nextBigInteger();
			
			System.out.println(k.remainder(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0)) ? "even" : "odd");
			
		}
		
		sc.close();
	}
}
