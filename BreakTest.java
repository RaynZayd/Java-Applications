/*This program tests the break statement that transfers control to statement after end of loop
 * */
public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 6; i++) {
			if(i >= 3) {
				System.out.println("i: " + i);
				break;//End of loop
			}
				System.out.println("Done");
		}
	}

}
