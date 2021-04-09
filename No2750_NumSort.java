import java.util.Arrays;
import java.util.Scanner;

/**
 * 수 정렬하기
 * @author jy-yi
 * 
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 */
public class No2750_NumSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(arr);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
