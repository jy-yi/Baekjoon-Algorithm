import java.util.Scanner;
/**
 * 시험 점수
 * @author jy-yi
 * 
 * 대한고등학교에 재학 중인 민국이와 만세는 4과목(정보, 수학, 과학, 영어)에 대한 시험을 봤다. 
 * 민국이와 만세가 본 4과목의 점수를 입력하면, 민국이의 총점 S와 만세의 총점 T 중에서 큰 점수를 출력하는 프로그램을 작성하시오. 
 * 단, 서로 동점일 때는 민국이의 총점 S를 출력한다.
 *
 */
public class No5596_Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int minkook = 0, manse = 0;
		
		for (int i = 0; i < 4; i++) {
			minkook += sc.nextInt();
		}
		
		for (int i = 0; i < 4; i++) {
			manse += sc.nextInt();
		}
		
		sc.close();
		
		if (minkook == manse) System.out.println(minkook);
		else System.out.println(minkook > manse ? minkook : manse);
	}
}
