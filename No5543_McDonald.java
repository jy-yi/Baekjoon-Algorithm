import java.util.Arrays;
import java.util.Scanner;

/**
 * 상근날드
 * @author jy-yi
 * 
 * 상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다. 
 * 주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라, 세트로 구매하면, 가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.
 * 
 * 햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라와 사이다 두 종류가 있다.
 * 
 * 햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.
 */
public class No5543_McDonald {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] burger = new int[3];
		int[] drink = new int[2];
		
		/* 햄버거 가격 */
		for (int i = 0; i < burger.length; i++) {
			burger[i] = sc.nextInt();
		}
		
		/* 음료수 가격 */
		for (int i = 0; i < drink.length; i++) {
			drink[i] = sc.nextInt();
		}
		
		sc.close();
		
		/* 가격 오름차순 정렬 */
		Arrays.sort(burger);
		Arrays.sort(drink);
		
		System.out.println(burger[0] + drink[0] - 50);
	}
}
