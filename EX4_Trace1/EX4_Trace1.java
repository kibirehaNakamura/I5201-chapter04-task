public class EX4_Trace1 {
	public static void main(String[] args) {
		int wa = 0;
		
		for(int k = 1; k <= 20; k++) {
			wa += 3;
		}
		System.out.println(wa);
		// forは20回ループしてwa = 60になる
	}
}