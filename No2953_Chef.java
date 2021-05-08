import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 나는 요리사다
 * @author jy-yi
 * 
 * "나는 요리사다"는 다섯 참가자들이 서로의 요리 실력을 뽐내는 티비 프로이다. 
 * 각 참가자는 자신있는 음식을 하나씩 만들어오고, 서로 다른 사람의 음식을 점수로 평가해준다. 점수는 1점부터 5점까지 있다.
 * 각 참가자가 얻은 점수는 다른 사람이 평가해 준 점수의 합이다. 이 쇼의 우승자는 가장 많은 점수를 얻은 사람이 된다.
 * 각 참가자가 얻은 평가 점수가 주어졌을 때, 우승자와 그의 점수를 구하는 프로그램을 작성하시오.
 *
 */
public class No2953_Chef {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		/* 각 평가 점수 map에 저장 */
		// [1=18, 2=17, 3=18, 4=19, 5=17]
		for (int i = 1; i <= 5; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += sc.nextInt();
			}
			map.put(i, sum);
		}
		
		sc.close();
		
		/* value 기준 내림차순 정렬 */
		List<Integer> keySetList = new ArrayList<Integer>(map.keySet());
		Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		
		System.out.println(keySetList.get(0) + " " + map.get(keySetList.get(0)));
	}
}
