import java.util.Scanner;
/**
 * 최댓값
 * @author jy-yi
 * 
 * 9×9 격자판에 쓰여진 81개의 자연수가 주어질 때, 
 * 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
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
