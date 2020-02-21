
public class AbstractTest {
	public static void main(String[] args) {
//    Shape obj = new Shape();
		Shape obj = new Circle();
		obj.display();
	double area	= obj.calArea();
	System.out.println(area);
	}
}
	abstract class Shape {
		Shape() {
			System.out.println("Shape.");
		}

		void display() {
			System.out.println("DISPLAY");
		}

		abstract double calArea();
	}

	class Circle extends Shape {

		@Override
		double calArea() {
			
			return 0.0;
		}

	}


