
public class Bike {
	double speed;
	static int count;

//建構子
	Bike() {
		speed = 7;
		count++;

	}

	static int getCount() {
		return count;

	}

	void addspeed() {
		speed *= 1.2;
	}

	void reduceSpeed() {

		speed *= 0.7;

	}

}
