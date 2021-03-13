import java.util.Scanner;
/**
 * 분수 합
 * @author jy-yi
 * 
 * 분수 A/B는 분자가 A, 분모가 B인 분수를 의미한다. A와 B는 모두 자연수라고 하자.
 * 
 * 두 분수의 합 또한 분수로 표현할 수 있다. 
 * 두 분수가 주어졌을 때, 그 합을 기약분수의 형태로 구하는 프로그램을 작성하시오. 
 * 기약분수란 더 이상 약분되지 않는 분수를 의미한다.
 *
 */
public class No1735_Fraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a1 = sc.nextInt(); // 분자1
		int b1 = sc.nextInt(); // 분모1

		int a2 = sc.nextInt(); // 분자2
		int b2 = sc.nextInt(); // 분모2
		
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
