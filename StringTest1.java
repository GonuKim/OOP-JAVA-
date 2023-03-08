package Solution;
import java.util.*;
public class StringTest {

	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("문자열을 입력하세요> ");
			str = sc.next();
			if (str.matches("^www\\.(.+)")) {
				System.out.println(str + "은 www로 시작합니다. ");
			}
			else {
				System.out.println(str + "은 www로 시작하지 않습니다.");
			}
		}

	}

}
