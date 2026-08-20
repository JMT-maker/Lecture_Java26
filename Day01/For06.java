package Day01;

public class For06 {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			System.out.printf("[구구단 %d단]\n", i);
			for(int y = 1; y <= 9; y++) {
				System.out.printf("%d * %d = %d\n", i, y, i*y);
			}
		}
	}
}
