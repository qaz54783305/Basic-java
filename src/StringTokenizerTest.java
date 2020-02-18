import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String s1 = "This is a test,test stringtokenizer.";

		StringTokenizer st = new StringTokenizer(s1);
		while (st.hasMoreElements()) {
        System.out.println(st.nextElement());
		}

	}
}
