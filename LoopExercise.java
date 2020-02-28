
public class LoopExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i <= 8;i++) {
			int j = i*2-5;
			if(j == -j) {
				continue;
			}
			double s = Math.sqrt(j);
			System.out.println(Math.sqrt(j));
			if(s > 4) {
				break;
			}
			System.out.println(i);
			System.out.println(j);
			System.out.println(s);
		}
		System.out.println("Done");
		
	}

}
