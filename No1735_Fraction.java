import java.util.Scanner;
/**
 * �м� ��
 * @author jy-yi
 * 
 * �м� A/B�� ���ڰ� A, �и� B�� �м��� �ǹ��Ѵ�. A�� B�� ��� �ڿ������ ����.
 * 
 * �� �м��� �� ���� �м��� ǥ���� �� �ִ�. 
 * �� �м��� �־����� ��, �� ���� ���м��� ���·� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ���м��� �� �̻� ��е��� �ʴ� �м��� �ǹ��Ѵ�.
 *
 */
public class No1735_Fraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a1 = sc.nextInt(); // ����1
		int b1 = sc.nextInt(); // �и�1

		int a2 = sc.nextInt(); // ����2
		int b2 = sc.nextInt(); // �и�2
		
		sc.close();

		int a3 = a1 * b2 + a2 * b1;
		int b3 = b1 * b2;

		int gcd = getGCD(a3, b3);

		System.out.println(a3 / gcd + " " + b3 / gcd);

	}

	public static int getGCD(int n, int m) {
		if (n % m == 0)
			return m;
		else
			return getGCD(m, n % m);
	}
}
