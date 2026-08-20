package Day01;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coin = 0;		
		System.out.print("금액 : ");
		coin = sc.nextInt();
		
		System.out.println("동전의 수 > ");
		System.out.println("500원 짜리 = " + coin / 500);
		System.out.println("100원 짜리 = " + coin % 500 / 100);
		

	}

}
