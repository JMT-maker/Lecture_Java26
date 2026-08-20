package Day01;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		
		System.out.print("정수를 입력하세요 : ");
		a = sc.nextInt();
		System.out.println(a % 2 == 0 ? "짝수" : "홀수");

	}

}
