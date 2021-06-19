import java.util.Scanner;
/**
 * 10부제
 * @author jy-yi
 * 
 * 서울시는 6월 1일부터 교통 혼잡을 막기 위해서 자동차 10부제를 시행한다. 
 * 자동차 10부제는 자동차 번호의 일의 자리 숫자와 날짜의 일의 자리 숫자가 일치하면 해당 자동차의 운행을 금지하는 것이다. 
 * 
 * 예를 들어, 자동차 번호의 일의 자리 숫자가 7이면 7일, 17일, 27일에 운행하지 못한다. 
 * 또한, 자동차 번호의 일의 자리 숫자가 0이면 10일, 20일, 30일에 운행하지 못한다.
 * 
 * 여러분들은 일일 경찰관이 되어 10부제를 위반하는 자동차의 대수를 세는 봉사활동을 하려고 한다. 
 * 날짜의 일의 자리 숫자가 주어지고 5대의 자동차 번호의 일의 자리 숫자가 주어졌을 때 위반하는 자동차의 대수를 출력하면 된다. 
 * 
 */
public class No10797_Car10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int carNum = sc.nextInt();
		
		int count = 0;
		
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if (carNum == n) count++;
		}
		
		sc.close();
		
		System.out.println(count);
	}
}
