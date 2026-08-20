package Day01;

import java.util.Scanner;

public class For05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, sum = 0;
		
		System.out.print("양의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		while(num < 0) {  
		    System.out.print("양의 숫자가 아닙니다. 다시 입력하세요 : ");
		    num = sc.nextInt();
		}
		
		for(int i = 1; i <= num; i++) {
		    sum += i;
		}
		System.out.printf("1부터 %d까지 합은 %d입니다.", num, sum);
	}
}
