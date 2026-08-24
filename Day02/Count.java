package day02;

import java.util.Scanner;

public class Count {
	public static int getCount(int[] arr, int bigOne) {
		
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > bigOne) {
				cnt++;
			}
		}
		return cnt;
	}
	
	
	public static void main(String[] args) {
		int[] arr1 = new int[] {20, 10, 30};
		int bigOne = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("기준 숫자를 입력하세요 : ");  
		bigOne = sc.nextInt();
		int cnt = getCount(arr1, bigOne);
		System.out.printf("입력한 %d 보다 큰 배열안의 숫자는 %d개 입니다.", bigOne, cnt);
	}
		
}
