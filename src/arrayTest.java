
public class arrayTest {

	public static void main(String[] args) {
		// 1 - 6 =>�U�X�{����
		int[] point = new int[6];
		for (int i = 0; i < 100; i++) {
			point[(int) (Math.random() * 6)]++;
		}

		for(int value : point) {
			
		System.out.println(value);	
		}
		   
		  
		
//		for(int i=0;i<point.length;i++) {
//			
//		System.out.println((i+1)+"�I�X�{"+point[i]);	
//			
//		}
		
	}

}
