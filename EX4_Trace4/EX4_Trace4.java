public class EX4_Trace4 {
	public static void main(String[] args) {
		int wa = 0;
		int k = 0;
		
		while (k < 20) {
			wa += 3;
			k++;
		}
		System.out.println(wa);
		// whileは20回ループしてwa = 60になる
	}
}