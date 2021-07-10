import java.util.Scanner;

public class No1676_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		long factorial = 1;
		for (int i = n; i > 0; i--) {
			factorial *= i;
		}
		
		int zeroCount = 0;
		char[] array = String.valueOf(factorial).toCharArray();
		
		for (int i = array.length-1; i >= 0; i--) {
			if (array[i] == '0') {
				zeroCount++;
			} else {
				break;
			}
		}
		
		
		System.out.println(zeroCount);
	}
}
