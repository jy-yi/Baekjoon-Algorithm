import java.util.Scanner;
/**
 * �Ľ�Į�� �ﰢ��
 * @author jy-yi
 * 
 * �Ľ�Į�� �ﰢ���� ���װ���� �ﰢ�� ���·� �迭�� ���ε�, ���� �Ľ�Į(1623-1662)�� ���� �̸� �ٿ�����.
 * �ܼ��� ���·�, �Ľ�Į�� �ﰢ���� ������ ���� ������� ���� �� �ִ�.
 * 	N��° �࿡�� N���� ���� �ִ�.
 * 	ù ��° ���� 1�̴�.
 * 	�� ��° �����, �� ���� �� ���� ���� 1�̰�, ������ ���� ���� �ٷ� �� ���� ������ �� ���� ���̴�.
 * 
 * ���� ���, n=3�̸� 3��° ���� 2��° ���� �� ���� ������ �� �� (1�� 1)�� ���ؼ� �����. 
 * n=6�� ��, �Ľ�Į �ﰢ���� 6��° ���� 10�� 5��° ���� ������ �� ��(4�� 6)�� ���ؼ� ���Ѵ�. 
 * 
 * ���� n�� k�� �־����� �� �Ľ�Į�� �ﰢ���� �ִ� n��° �࿡�� k��° ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.  
 * �̶�, �� ���� ���װ�� C(n-1,k-1)�ӿ� �����Ͻÿ�.
 *
 */
public class No16395_PascalsTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		sc.close();
		
		int[][] triangle = new int[n][];
		
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = new int[i+1];
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				triangle[i][j] = 1;
				
				if (i > 1 && j > 0 && j <= i-1) {
					triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
				}
			}
		}
		
		System.out.println(triangle[n-1][k-1]);
	}
}
