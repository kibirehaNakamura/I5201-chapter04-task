public class EX4_9XKuku {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j <= i; j++) {
				for(int k = 1; k <= i; k++) {
					System.out.print((j * k) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}