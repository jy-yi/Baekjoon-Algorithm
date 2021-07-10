import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * 공
 * @author jy-yi
 * 
 * 세준이는 컵 3개를 탁자 위에 일렬로 엎어놓았다. 컵의 번호는 맨 왼쪽 컵부터 순서대로 1번, 2번 3번이고, 세준이는 이 컵을 이용해서 게임을 하려고 한다.
 * 먼저 1번 컵의 아래에 공을 하나 넣는다. 세준이는 두 컵을 고른 다음, 그 위치를 맞바꾸려고 한다. 
 * 예를 들어, 고른 컵이 1번과 2번이라면, 1번 컵이 있던 위치에 2번 컵을 이동시키고, 동시에 2번 컵이 있던 위치에 1번 컵을 이동시켜야 한다. 
 * 이때 공은 움직이지 않기 때문에, 공의 위치는 맨 처음 1번 컵이 있던 위치와 같다.
 * 세준이는 컵의 위치를 총 M번 바꿀 것이며, 컵의 위치를 바꾼 방법이 입력으로 주어진다. 위치를 M번 바꾼 이후에 공이 들어있는 컵의 번호를 구하는 프로그램을 작성하시오.
 *
 */
public class No1547_Ball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Map<Integer, Integer> cup = new HashMap<Integer, Integer>();
		cup.put(1, 1);
		cup.put(2, 2);
		cup.put(3, 3);

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			int tempKey = getKey(cup, y);
			cup.put(getKey(cup, x), y);
			cup.put(tempKey, x);
		}
		
		System.out.println(cup.get(1));

		sc.close();
	}

	/**
	 * value로 key 검색
	 * @param cup
	 * @param value
	 * @return
	 */
	public static Integer getKey(Map<Integer, Integer> cup, Integer value) {
		for (Integer i : cup.keySet()) {
			if (cup.get(i).equals(value)) {
				return i;
			}
		}
		return null;
	}
}
