public class EX4_Trace7 {
	public static void main(String[] args){
		int wa = 0;
		int k = 1;
		
		while(k <= 10) {
			wa += k;
			++k;
		}
		System.out.println(wa);
		// whileは10回ループして、waは1から10まで順番に加算されて55になる
	}
}