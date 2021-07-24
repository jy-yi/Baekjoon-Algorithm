import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 이진수
 * @author jy-yi
 *
 * 양의 정수 n이 주어졌을 때, 이를 이진수로 나타냈을 때 1의 위치를 모두 찾는 프로그램을 작성하시오. 
 * 최하위 비트(least significant bit, lsb)의 위치는 0이다.
 */
public class No3460_Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			
			String binary = Integer.toBinaryString(n);
			List<Integer> list = new ArrayList<Integer>();
			
			for (int j = 0; j < binary.length(); j++) {
				list.add(Integer.parseInt(binary.substring(j, j+1)));
			}

			Collections.reverse(list);
			
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j) == 1) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
