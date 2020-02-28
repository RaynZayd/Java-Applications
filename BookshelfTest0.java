/*Rayn Zayd
 * This program demonstrates the imprecision of float point numbers
 * */
public class BookshelfTest0 {

	public static void main(String[] args) {
		
		int booksPlaced = 0;//Books on shelf so far
		double length = 0.1;//Length of book
		double lengthLeft = 1.0;//Remaining space

		//Code should try and place books of length 0.1,0.2,
		//0.3,0.4,0.5m on shelf of 1m using loop construct
		while(length == lengthLeft) {
			--lengthLeft;
			++booksPlaced;
		}
		System.out.println("Books placed: " + booksPlaced);
		System.out.println("Length left: "+lengthLeft);
		
		
	}

}
