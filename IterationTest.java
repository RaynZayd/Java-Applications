/*Rayn Zayd
 * This program test iterations
 * prints out every third number between 11 and 47*/
public class IterationTest {

	public static void main(String[] args) {
		//Exercise 1
		//Code iteration below
		int i;
		for(i = 9;i <= 47;i++) {//Nested if statements
			i += 2;
			if(i % 2 == 0) {
			System.out.println(i + " Number is even");
			}else {
				System.out.println(i + " Number is odd");
			}//code above prints out whether each code is even or odd
		}
		
	}

}
