import java.util.Scanner;
/**
 * ������
 * @author jy-yi
 * 
 * (A+B)%C�� ((A%C) + (B%C))%C �� ������?
 * (A��B)%C�� ((A%C) �� (B%C))%C �� ������?
 * 
 * �� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No10430_Mod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		sc.close();

		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);
	}
}
