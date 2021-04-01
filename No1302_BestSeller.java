import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 * 베스트셀러
 * @author jy-yi
 * 
 * 김형택은 탑문고의 직원이다. 김형택은 계산대에서 계산을 하는 직원이다. 
 * 김형택은 그날 근무가 끝난 후에, 오늘 판매한 책의 제목을 보면서 가장 많이 팔린 책의 제목을 칠판에 써놓는 일도 같이 하고 있다.
 * 
 * 오늘 하루 동안 팔린 책의 제목이 입력으로 들어왔을 때, 가장 많이 팔린 책의 제목을 출력하는 프로그램을 작성하시오.
 *
 */
public class No1302_BestSeller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Map<String, Integer> book = new HashMap<String, Integer>();

		/* 책 제목 : 팔린 개수 */
		for (int i = 0; i < n; i++) {
			String title = sc.next();
			book.put(title, book.getOrDefault(title, 0) + 1);
		}

		sc.close();

		List<String> titleList = new ArrayList<String>(book.keySet());

        // Value 기준 내림차순 정렬
        titleList.sort((o1, o2) -> book.get(o2) - book.get(o1));
        
        int max = book.get(titleList.get(0)); // 내림차순으로 정렬했으므로 첫 번째 value가 최대값
        
        List<String> bestSeller = new ArrayList<String>();
        
        /* 베스트 셀러가 여러 개일 경우 */
        for (String s : titleList) {
			if (max == book.get(s)) {
				bestSeller.add(s);
			}
		}
        
        Collections.sort(bestSeller); // 책 제목 사전 순으로 정렬

        System.out.println(bestSeller.get(0)); // 사전 순으로 가장 앞서는 제목
		
	}
}
