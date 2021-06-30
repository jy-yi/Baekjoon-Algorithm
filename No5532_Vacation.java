import java.util.Scanner;
/**
 * ���� ����
 * @author jy-yi
 * 
 * ����̴� �ʵ��б��� �ٴ� ��, ���� ������ ���麸�� ���� �̸� �ϰ� ���� �Ⱓ�� ��Ҵ�. ���� ������ ���а� ���� ���� Ǯ���̴�.
 * ������ �� L���̴�. ������ �� B������, ����� �� A�������� Ǯ��� �Ѵ�. ����̴� �Ϸ翡 ��� �ִ� C������, ������ �ִ� D������ Ǯ �� �ִ�.
 * ����̰� �ܿ� ���е��� ������ ���� �ʰ� �� �� �ִ� �ִ� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No5532_Vacation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int a = sc.nextInt();	// ���� ���� ��
		int b = sc.nextInt(); 	// ���� ���� ��
		double c = sc.nextDouble();	// ���� �ִ� ���� ��
		double d = sc.nextDouble();	// ���� �ִ� ���� ��
		
		sc.close();
		
		int korean = (int) Math.ceil(a / c);
		int math = (int) Math.ceil(b / d);
		
		int max = korean > math ? korean : math;
		
		System.out.println(l - max);
	}
}
