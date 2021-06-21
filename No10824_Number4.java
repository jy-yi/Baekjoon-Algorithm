import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 네 수
 * @author jy-yi
 * 
 * 네 자연수 A, B, C, D가 주어진다. 이때, A와 B를 붙인 수와 C와 D를 붙인 수의 합을 구하는 프로그램을 작성하시오.
 * 두 수 A와 B를 합치는 것은 A의 뒤에 B를 붙이는 것을 의미한다. 즉, 20과 30을 붙이면 2030이 된다.
 *
 */
public class No10824_Number4 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
		
		String a = str[0];
		String b = str[1];
		String c = str[2];
		String d = str[3];
		
		long x = Long.parseLong(a+b);
		long y = Long.parseLong(c+d);
		
		System.out.println(x+y);
	}
}
