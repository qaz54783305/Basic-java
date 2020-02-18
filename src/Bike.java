
public class Bike {
	// 類別中才能進行存取
	private double speed;
	static int count;

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	// 建構子
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
