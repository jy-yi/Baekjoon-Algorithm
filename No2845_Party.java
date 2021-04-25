import java.util.Scanner;

public class No2845_Party {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int p = sc.nextInt();
		
		int participants = l * p;
		
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			
			System.out.print(n - participants + " ");
		}
		
		sc.close();
	}
}
