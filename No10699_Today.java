import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
/**
 * 오늘 날짜
 * @author jy-yi
 * 
 * 서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
 *
 */
public class No10699_Today {
	public static void main(String[] args) {
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		df.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
		System.out.format(df.format(date));
	}
}
