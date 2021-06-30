import java.util.Scanner;
/**
 * TGN
 * @author jy-yi
 * 
 * 상근이는 TGN사의 사장이다. TGN은 Teenager Game Network의 약자 같지만, 사실 Temporary Group Name의 약자이다.
 * 이 회사는 청소년을 위한 앱을 만드는 회사이다. 일년에 걸친 개발기간 끝에 드디어 앱을 완성했고, 이제 팔기만 하면 된다.
 * 상근이는 데이트를 인간의 두뇌로 이해할 수 없을 정도로 많이 한다. 따라서 엄청난 데이트 비용이 필요하다. 상근이는 광고를 적절히 해서 수익을 최대한 올리려고 한다.
 * 어느 날 하늘을 바라보던 상근이는 시리우스의 기운을 받게 되었고, 광고 효과를 예측하는 능력을 갖게 되었다.
 * 광고 효과가 주어졌을 때, 광고를 해야할지 말아야할지 결정하는 프로그램을 작성하시오.
 *
 */
public class No5063_TGN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int r = sc.nextInt();	// 광고를 하지 않았을 때 수익
			int e = sc.nextInt();	// 광고를 했을 때의 수익
			int c = sc.nextInt();	// 광고 비용
			
			if (r > (e-c)) System.out.println("do not advertise");
			else if (r == (e-c)) System.out.println("does not matter");
			else System.out.println("advertise");
		}
		
		sc.close();
	}
}
