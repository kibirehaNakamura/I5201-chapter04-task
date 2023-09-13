public class EX4_Trace6 {
	public static void main(String[] args) {
		int wa = 5;
		
		for(int k = 10; k > 20; k++) {
			wa += 3;
		}
		System.out.println(wa);
		// forは一度も実行されずwaは初期値の5になる
	}
}