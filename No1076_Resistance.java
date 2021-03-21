import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 저항
 * @author jy-yi
 *
 * 전자 제품에는 저항이 들어간다. 저항은 색 3개를 이용해서 그 저항이 몇 옴인지 나타낸다.
 * 처음 색 2개는 저항의 값이고, 마지막 색은 곱해야 하는 값이다.
 */
public class No1076_Resistance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long answer = 0L;
		
		Map<String, Integer> colorMap = new HashMap<String, Integer>();
		colorMap.put("black", 0);
		colorMap.put("brown", 1);
		colorMap.put("red", 2);
		colorMap.put("orange", 3);
		colorMap.put("yellow", 4);
		colorMap.put("green", 5);
		colorMap.put("blue", 6);
		colorMap.put("violet", 7);
		colorMap.put("grey", 8);
		colorMap.put("white", 9);
		
		String temp = "";
		
		for (int i = 0; i < 3; i++) {
			String s = sc.nextLine();
			
			if (i == 2) {
				answer = (long) (Long.parseLong(temp) * Math.pow(10, colorMap.get(s)));
			} else {
				temp += colorMap.get(s);
			}
		}
		
		sc.close();
		
		System.out.println(answer);
	}
}
