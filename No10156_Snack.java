import java.util.Scanner;

/**
 * 과자
 * @author jy-yi
 * 
 * 동수는 제과점에 과자를 사러 가는데 현재 가진 돈이 모자랄 경우 부모님께 모자란 돈을 받으려고 한다. 
 * 과자 한 개의 가격이 K, 사려고 하는 과자의 개수가 N이고, 현재 가진 돈의 액수를 M이라 할 때 
 * 여러분은 동수가 부모님께 받아야 하는 모자란 돈을 계산하려고 한다.
 * 
 * 과자 한 개의 가격, 사려고 하는 과자의 개수와 동수가 현재 가진 돈의 액수가 주어질 때 
 * 동수가 부모님께 받아야 하는 돈의 액수를 출력하는 프로그램을 작성하시오.
 *
 */
public class No10156_Snack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt(); // 과자 한 개 가격
		int n = sc.nextInt(); // 사려고 하는 과자 개수
		int m = sc.nextInt(); // 동수가 가진 돈
		
		int money = k * n - m;
		
		sc.close();
		
		System.out.println(money > 0 ? money : 0);
	}
}
