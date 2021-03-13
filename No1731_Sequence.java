import java.util.Scanner;
/**
 * 추론
 * @author jy-yi
 * 
 * 등차가 정수인 등차수열 (어떤 수에 차례대로 일정한 수를 더해서 이루어지는 수열) 은 2개의 숫자로 나타낼 수 있다. 
 * P는 수열의 첫 번째 수이고, Q는 그 다음수가 되기 위해 바로 전의 수에 더해야 하는 수이다. 예를 들어 P=1, Q=2 이면 그 등차수열은 1, 3, 5, 7, ..... 이 된다.
 * 
 * 등비가 정수인 등비수열 (어떤 수에서 시작해 차례로 같은 수를 곱하여 만든 수열) 은 등차수열과 비슷하게 2개의 숫자로 나타낼 수 있다. 
 * P는 수열의 첫 번째 수이고, Q는 그 다음수가 되기 위해 바로 전의 수에 곱해야 하는 수이다. 예를 들어 P=3, Q=2이면 그 등비수열은 3, 6, 12, ...이 된다.
 * 
 * 테디는 세상에서 수학을 제일 좋아해서 매일같이 이 수열이 등차수열인지 등비수열인지 정한다음에 다음 수를 구한다.
 * 
 * 어떤 수열이 주어졌을 때, 그 수열의 규칙이 등차수열인지, 등비수열인지 결정한 후에, 다음에 등장할 수를 구하는 프로그램을 작성하시오.
 *
 */
public class No1731_Sequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		sc.close();
		
		boolean arithmetic = false; // 등차수열 여부
		boolean geometric = false;  // 등비수열 여부
		
		for (int i = 0; i < array.length - 2; i++) {
			if (array[i] - array[i+1] == array[i+1] - array[i+2]) {
				arithmetic = true;
			} else {
				arithmetic = false;
				break;
			}
		}
		
		for (int i = 0; i < array.length - 2; i++) {
			if (array[i+1] / array[i] == array[i+2] / array[i+1]) {
				geometric = true;
			} else {
				geometric = false;
				break;
			}
		}
		
		if (arithmetic) {
			System.out.println(array[n-1] + (array[1] - array[0]));
		} else {
			if (geometric)
				System.out.println(array[n-1] * (array[1] / array[0]));
		}
		
		
	}
}
