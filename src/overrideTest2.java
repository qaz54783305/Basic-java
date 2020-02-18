
public class overrideTest2 extends overrideTest {

	int getInt() {
		System.out.println("Test2: getint2");
		return 1;
	}
    //覆載
	void eat(int a) {
		System.out.println("eat:" + a);
	}

	void eat(int a, int b) {
		System.out.println("eat:" + a + "," + b);
	}

	void eat(String c) {
		System.out.println("eat3:" + c);
	}

}
