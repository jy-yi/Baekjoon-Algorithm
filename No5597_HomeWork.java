import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 과제 안 내신 분..?
 * @author jy-yi
 * 
 * X대학 M교수님은 프로그래밍 수업을 맡고 있습니다. 
 * 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있습니다.
 * 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하세요.
 *
 */
public class No5597_HomeWork {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> allStudent = new ArrayList<Integer>();
		
		/* 과제 제출한 학생 리스트 */
		for (int i = 0; i < 28; i++) {
			list.add(sc.nextInt());
		}
		sc.close();
		
		/* 1~30번까지의 학생 */
		for (int i = 1; i <= 30; i++) {
			allStudent.add(i);
		}
		
		allStudent.removeAll(list);	// 전체 학생에서 과제 제출한 학생 제거
		
		for (Integer integer : allStudent) {
			System.out.println(integer);
		}
		
	}
}
