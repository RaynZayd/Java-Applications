/*Exercise
 * Program is used to find out if average speed isn't 60kmph
 * By Rayn Zayd*/
public class Bicycle {

	public static void main(String[] args) {
		//First section
		double upHill = 30.0;//variable of type double
		double downHill = 90.0;
		double aveSpeed = (upHill + downHill)/2;//calculates average speed
		System.out.println(aveSpeed);//outputs average speed of 60.0
		//Second section
		double upHill2 = 20.0;
		double downHill2 = 100.0;
		double aveSpeed2 = (upHill2 + downHill2)/2;
		System.out.println(aveSpeed2);//outputs 60.0
	}

}
