import java.util.Scanner;
/**
 * �ɺθ� ���� ��
 * @author jy-yi
 * 
 * �±��̴� ���� �б�, PC��, �п��� �ٴѴ�.
 * �ݺ��Ǵ� �ϻ� �ͼ����� �±��̴� �̵��ð��� �����ؼ� PC�濡 �� ���� �ӹ��� �;���.
 * 
 * �׷��� �����ġ�� ��� �̵��� ������ ����� �� �� ���� ���� �м��غ���� �ߴ�.
 * 
 * ���� ������ �±��̴� ������ ����� ���� ��, ���� �� ������ ��ϵǾ��ִ�!
 * �ǳ� ��⸸ �ؼ� �� �̵� �ð��� �� �� �� ������ ����� �� �ϴ� �±��̸� ��������.
 * 
 * �Ϸ� ���� ������ ����� �־�����, �̳��� �� �̵� �ð��� �� �� �� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No5554_WayToErrand {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = 0;
		
		for (int i = 0; i < 4; i++) {
			time += sc.nextInt();
		}
		
		sc.close();
		
		System.out.println(time / 60);
		System.out.println(time % 60);
	}
}
