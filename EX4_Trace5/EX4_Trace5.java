public class EX4_Trace5 {
	public static void main(String[] args) {
		int wa = 0;
		
		for(int k = 1; k <= 10; ++k) {
			wa += k;
		}
		System.out.println(wa);
		// forは10回ループしてwaには1から10が順番に加算されて55になる
	}
}