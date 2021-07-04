import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 문자열 분석
 * @author jy-yi
 * 
 * 문자열 N개가 주어진다. 이때, 문자열에 포함되어 있는 소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램을 작성하시오.
 * 각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다.
 */
public class No10820_StringAnalize {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = "";

		while ((input = br.readLine()) != null) {
			int lower = 0, upper = 0, number = 0, blank = 0;
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (Character.isLowerCase(c)) lower++;
				else if (Character.isUpperCase(c)) upper++;
				else if (Character.isDigit(c)) number++;
				else if (Character.isSpaceChar(c)) blank++;
			}
			System.out.println(lower + " " + upper + " " + number + " " + blank);
		}

	}
}
