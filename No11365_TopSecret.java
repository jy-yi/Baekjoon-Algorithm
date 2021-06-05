import java.util.Scanner;
/**
 * !밀비 급일
 * @author jy-yi
 * 
 * 당신은 길을 가다가 이상한 쪽지를 발견했다. 그 쪽지에는 암호가 적혀 있었는데, 똑똑한 당신은 암호가 뒤집으면 해독된다는 것을 발견했다.
 * 이 암호를 해독하는 프로그램을 작성하시오.
 */
public class No11365_TopSecret {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.nextLine();
			
			if ("END".equals(str)) break;
			
			System.out.println(new StringBuffer(str).reverse().toString());
		}
		
		sc.close();
	}
}
