package Day01;

import java.util.Scanner;

public class For03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		dan = sc.nextInt();
		
		System.out.printf("[구구단 %d단] \n", dan);
		for(int i = 0; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		}
	}
}
