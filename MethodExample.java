
public class MethodExample {

	public static void main(String[] args) {
		
		double boxWeight = 50;
		double boxCube = 10;
		//String boxID = "Box A";//Local example won't compile
		double density = getDensity(boxWeight, boxCube);
		System.out.println("Density: " + density);
		printBox(boxWeight, boxCube); //Prints density 2nd time
		

	}
	public static double getDensity(double bw, double bc) {
		double result = bw/bc; //result could be density
		return result;
	}
	public static void printBox(double w, double c) {
		System.out.println("Box weight: " +w+ " cube: "+c);
		System.out.println("Density: " + getDensity(w,c));
		//System.out.println("ID: "+boxID);//No access to ID so won't compile
	}
}
	
