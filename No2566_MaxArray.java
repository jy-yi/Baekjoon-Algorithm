import java.util.Scanner;
/**
 * �ִ�
 * @author jy-yi
 * 
 * 9��9 �����ǿ� ������ 81���� �ڿ����� �־��� ��, 
 * �̵� �� �ִ��� ã�� �� �ִ��� �� �� �� ���� ��ġ�� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class No2566_MaxArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] array = new int[9][9];
		
		int max = 0;
		int a = 0, b = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextInt();
				
				if (array[i][j] > max) {
					max = array[i][j];
					a = i;
					b = j;
				}
				
			}
		}
		
		sc.close();
		
		System.out.println(max);
		System.out.println((a+1) + " " + (b+1));
		
	}
}
