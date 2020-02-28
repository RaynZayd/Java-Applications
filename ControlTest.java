/*Program by Rayn Zayd
 * Program implements control structure branch
 * d for demand
 * s for supply
 * p for price
 * a for price raise calculation
 * b for price fall calculation
 * */

import javax.swing.*;//Import GUI

public class ControlTest {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Enter Supply:");
		double s = Integer.parseInt(input);//Read input into double type
		
		//Declared and initialised five double variables
		double d = 100.0;
		//double s = 50.0;
		double p = 10.0;
		double a = 0.1;
		double b = 0.2;

		//Code below has predefined variables
		if(d > s){
			double newP = p + a*(d-s);
			System.out.println("demand is greater than supply: "+newP);
		}else if(d == s) {
			System.out.println("demand is equal to supply do Nothing!");
		}else if(d < s){
			double newP = p + b*(s-d);
			System.out.println("demand is less than supply: "+newP);
		}

	}
}
