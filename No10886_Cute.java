import java.util.Scanner;
/**
 * 0 = not cute / 1 = cute
 * @author jy-yi
 * 
 * 준희는 자기가 팀에서 귀여움을 담당하고 있다고 생각한다.
 * 하지만 연수가 볼 때 그 의견은 뭔가 좀 잘못된 것 같았다. 그렇기에 설문조사를 하여 준희가 귀여운지 아닌지 알아보기로 했다.
 * 
 */
public class No10886_Cute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int zeroCnt = 0, oneCnt = 0;
		
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			
			if (k == 0) zeroCnt++;
			else oneCnt++;
		}
		
		sc.close();
		
		if (oneCnt > zeroCnt) System.out.println("Junhee is cute!");
		else System.out.println("Junhee is not cute!");
	}
}
