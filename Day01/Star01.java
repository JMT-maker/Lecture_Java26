package Day01;

import java.util.Scanner;

public class Star01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {        
            for(int j = 1; j <= i; j++) {      
                System.out.print("*");
            }
            System.out.println();              
        }
	}

}
