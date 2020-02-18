
public class OverloadTest {

	public static void main(String[] args) {
		overrideTest2 ov2 = new overrideTest2();
		ov2.eat(1);
		ov2.eat(1, 2);
		ov2.eat("TEST");
   
	}

}
