package Day01;

import java.util.Scanner;

public class Swap {
	// 2개의 변수를 입력받아 swapping 하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 값을 받을 a,b 및 swap 공간 변수 선언
		int a, b = 0;
		int swap = 0;
		
		// a,b 입력받기
		System.out.print("변수 a에 넣을 숫자 입력 : ");
		a = sc.nextInt();
		System.out.print("변수 b에 넣을 숫자 입력 : ");
		b = sc.nextInt();
		
		// swap 결과 출력
		System.out.print("Swapping 결과 > ");
		swap = a;
		a = b;
		b = swap;
		System.out.print(a + ", ");
		System.out.println(b);
		
		
	}

}
