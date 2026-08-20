package Day01;

import java.util.Scanner;

public class Switch01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, oddeven = 0;
		
		System.out.print("숫자를 입력하세요 ");
		num = sc.nextInt();
		
		oddeven = num % 2;
		
		switch(oddeven) {
			case 0:
				System.out.println("짝수입니다.");
				break;
			case 1:
				System.out.println("홀수입니다.");
				break;
		}
	
	}	
}
