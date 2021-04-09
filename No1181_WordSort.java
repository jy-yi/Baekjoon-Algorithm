import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 단어 정렬
 * @author jy-yi
 * 
 * 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
 * 
 *   1. 길이가 짧은 것부터
 *   2. 길이가 같으면 사전 순으로
 *
 */
public class No1181_WordSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Map<String, Integer> wordMap = new TreeMap<String, Integer>();	// key 값이 자동 오름차순 정렬되어 삽입되는 트리

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			wordMap.put(s, s.length()); // (단어, 단어길이) 형태로 Map에 저장
		}

		sc.close();

		List<String> keySetList = new ArrayList<String>(wordMap.keySet());
		
		/* value 기준 오름 차순 정렬*/
		Collections.sort(keySetList, (o1, o2) -> (wordMap.get(o1).compareTo(wordMap.get(o2))));
		
		for (String string : keySetList) {
			System.out.println(string);
		}

	}
}
