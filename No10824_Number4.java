import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �� ��
 * @author jy-yi
 * 
 * �� �ڿ��� A, B, C, D�� �־�����. �̶�, A�� B�� ���� ���� C�� D�� ���� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �� �� A�� B�� ��ġ�� ���� A�� �ڿ� B�� ���̴� ���� �ǹ��Ѵ�. ��, 20�� 30�� ���̸� 2030�� �ȴ�.
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
