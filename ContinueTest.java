/*This code demonstrates the continue statement in termination of the iteration.
 * By Rayn Zayd
 * */
public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 6;i++) {
			if(i <= 4 ) {
				System.out.println("i: " + i);
				continue;
			}
			System.out.println("Done");
			
		}
	}

}
