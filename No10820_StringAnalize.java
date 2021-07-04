import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * ���ڿ� �м�
 * @author jy-yi
 * 
 * ���ڿ� N���� �־�����. �̶�, ���ڿ��� ���ԵǾ� �ִ� �ҹ���, �빮��, ����, ������ ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �� ���ڿ��� ���ĺ� �ҹ���, �빮��, ����, �������θ� �̷���� �ִ�.
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
