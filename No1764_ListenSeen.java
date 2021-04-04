import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * 듣보잡
 * @author jy-yi
 * 
 * 김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 
 * 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오.
 *
 */
public class No1764_ListenSeen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc .nextInt();
		int m = sc.nextInt();
		
		Set<String> notListen = new HashSet<String>();
		List<String> notSeen = new ArrayList<String>();
		
		/* 듣도 못한 사람 */
		for (int i = 0; i < n; i++) {
			notListen.add(sc.next());
		}
		
		/* 보도 못한 사람 */
		for (int i = 0; i < m; i++) {
			String s = sc.next();
			if (notListen.contains(s)) {
				notSeen.add(s);
			}
		}
		
		sc.close();
		
		Collections.sort(notSeen);	// 사전순 정렬
		
		System.out.println(notSeen.size());
		for (String string : notSeen) {
			System.out.println(string);
		}
	}
}
