public class EX4_Trace2 {
	public static void main(String[] args) {
		int wa;
		int k;
		
		for(wa = k = 0; k < 20; k++) {
			wa += 3;
		}
		System.out.println(wa);
		// 初期値の指定こんな胡乱な記述できるの？っておもいました
		// forは20回ループしてwa = 60になる
	}
}