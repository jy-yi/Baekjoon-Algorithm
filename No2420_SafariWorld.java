import java.util.Scanner;

/**
 * ���ĸ�����
 * @author jy-yi
 * 
 * ���ĸ������ ���ͳ����θ� �����ϴ� �̽��׸��� �����̴�. 
 * ���ĸ����忡�� 2���� ���굵������ seunghwan.royal.gov.sw�� kyuhyun.royal.gov.sw �� �ִµ�, 
 * �̰��� couple.royal.gov.sw���� ������ ���̴�. 
 * 
 * �׷��� ������ ���� ���� SWNIC(������: �赿��)���� ������ ���� �ִ�. 
 * �� ���굵������ ��ĥ ��, ������ ���̰� �ʹ� ���̳��� ���� ��쿡�� �� ���굵������ ��ȥ��Ű�� ���̴�. 
 * 
 * ���굵������ ������ �����̴�. �� ���굵������ ������ �־����� ��, �� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No2420_SafariWorld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Long n = sc.nextLong();
		Long m = sc.nextLong();
		
		sc.close();
		
		System.out.println(Math.abs(n-m));
	}
}
