package Day01;

import java.util.Scanner;

public class For04 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, pac = 1;
		
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		for(int i = num; i > 0; i--) {
			pac*=i;
		}
		System.out.printf("%d! = %d \n", num, pac);
	}
}
