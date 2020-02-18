
public class StringBufferTest {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	System.out.println(sb.toString());
	sb.append("Test1");
	System.out.println(sb.toString());
	sb.append("Test2");
	System.out.println(sb.toString());
	sb.reverse();
	System.out.println(sb.toString());
    sb.replace(0, 1, "Tast1");
    System.out.println(sb.toString());

}
}
