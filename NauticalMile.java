/*This program calculates the average length of a 1 minute arc of latitude on the earth's surface.
 * Circumference of the earth = 24859.82 statue miles.
 * Statue mile = 5280 feet
 * Circumference = 360
 * Calculation = nm number of feet in circumference / number of minutes of circumference
 * Applied appropriate data types when dividing*
 * prints output: Feet in nautical mile = 6076.844888888889
 * */
public class NauticalMile {

	public static void main(String[] args) {
		double circum = 24859.82*5280;
		int minutesInCircle = 360*60;//This is a comment
		double nautMile = circum / minutesInCircle;
		System.out.println("Feet in nautical mile = " + nautMile);

	}
	
} //Java is case sensitive
/*Fixed intentional compile time errors and syntax errors for testing purposes
 * */
 