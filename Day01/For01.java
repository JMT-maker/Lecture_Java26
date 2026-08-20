package Day01;

import java.util.Scanner;

public class For01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입ㄴ다.", num, sum);
		
	}
}
