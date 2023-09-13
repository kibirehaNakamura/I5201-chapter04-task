public class EX4_Trace9 {
	public static void main(String[] args) {
		int wa = 0;
		int k;
		
		int[] arraySu = {10, 20, 30, 40, 50};	// テキストではarreyになってたけど直しました
		
		for(int su: arraySu) {
			wa += su;
		}
		System.out.println("wa = " + wa);
		// 拡張for文なんて4章じゃちょろっと触れてるだけじゃないですか！
		// waにはarraySuに含まれているすべての要素を順番に加算して150になる
	}
}