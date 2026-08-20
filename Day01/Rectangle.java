package Day01;

import java.util.Scanner;

public class Rect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b = 0;
		
		System.out.print("직사각형의 가로 길이 : ");
		a = sc.nextInt();
		System.out.print("직사각형의 세로 길이 : ");
		b = sc.nextInt();
		System.out.println("직사각형의 넓이는 "+ (a+b) + "cm입니다.");

	}

}
