public class EX4_Trace8 {
	public static void main(String[] args) {
		int wa = 5;
		int k = 10;
		
		while(k > 20) {
			wa += 3;
			k++;
		}
		System.out.println(wa);
		// whileは一度も実行されず、waは初期値の5になる
	}
}