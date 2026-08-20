package Day01;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double half = 0;
		final double PI = 3.14;
		
		System.out.print("원의 반지름을 입력하세요(cm) : ");
		half = sc.nextFloat();
		
		System.out.printf("원의 넓이는 %.2f 입니다", half*half*PI); 
	}

}
