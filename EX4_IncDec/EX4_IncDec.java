public class EX4_IncDec {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		int k = 1;
		int l = 1;
		
		System.out.println("++iの結果 " + ++i);	// 前置インクリメントは加算が先に行われる？
		System.out.println("j++の結果 " + j++);	// 後置インクリメントは表示が先に行われる？
		System.out.println("--kの結果 " + --k);	// デクリメントも前置後置で同様？
		System.out.println("l--の結果 " + l--);
		// 予想通り。
	}
}