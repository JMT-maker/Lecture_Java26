package app;

import java.util.Scanner;

import account.Account;
import account.AccountMemDao;

public class JIMINConsoleBank01 {
	
	static String[] startMenu = {"0.종료", "1.계좌등록", "2.계좌조회", "3.입금", "4.출금"};
	static Scanner sc = new Scanner(System.in);
	static AccountMemDao accountDao = new AccountMemDao();
	
	public static void main(String[] args) {
		welcomeMessage();
		startBankMenu();
		sayGoobye();
	}
	
	private static void startBankMenu() {
		while(true) {
			int menu = getMenu(startMenu);
			switch (menu) {
			case 1: //계좌 등록
				menuAccountRegist();
				break;
			case 2: //계좌 조회
				menuAccountList();
				break;
			case 3: // 입금
				menuDeposit();
				break;
			case 4: // 출금
				menuWidthdraw();
				break; 
			case 0: // 종료 
				return;
			default : // 없는 메뉴
				System.out.println("안돼 돌아가");
			}
			
		}
		
	}
	
	private static void menuAccountRegist() {
		// 계좌 등록 : 계좌주 이름, 비밀번호, 초기입금액
		System.out.println("[계좌 등록]");
		System.out.println("계좌 주");
		String owner = sc.nextLine();
		System.out.println("비밀번호 : ");
		String password = sc.nextLine();
		System.out.println("초기 입금액 : ");
		int amount = Integer.parseInt(sc.nextLine());
		
		if (accountDao.insertAccount(owner, password, amount)) {
			System.out.println("계좌 등록 했다잉");			
		} else {
			System.out.println("계좌 등복 불가~");
		}
	}

	private static void menuAccountList() {
		System.out.println("[계좌 조회]");
		showAccountList();
	}

	private static void showAccountList() {
		Account[] accountList = accountDao.selectAll();
		for (int i = 0; i < accountList.length; i++) {
			System.out.println(accountList[i]);
		}
	}
	
	
	
	private static void menuDeposit() {
		System.out.println("[입금]");
		showAccountList();
		// 계좌번호, 입금액 입력 
		System.out.println("계좌 번호 : ");
		int accountNo = sc.nextInt();
		System.out.println("입금액 : ");
		int amount = sc.nextInt();
		sc.nextLine();
		
		// dao 에게 입금 요청
		if (accountDao.deposit(accountNo, amount)) {
			System.out.println("입금 완료");
		}else {
			System.out.println("입금 불가");
		}
	}

	private static void menuWidthdraw() {
		System.out.println("[출금]");

	}

	private static int getMenu(String[] menuList) {
		// 메뉴 출력 
		System.out.println("--------------------------------");
		for (int i = 1; i < menuList.length; i++) {
			System.out.println(menuList[i]);
		}
		System.out.println(menuList[0]);
		System.out.println("--------------------------------");
		// 메뉴 선택
		System.out.println(">> 고르쇼 << : ");
		int menu = sc.nextInt(); // 남아있는 \n 삭제하려고 사용
		sc.nextLine();
		return 0;
	}
	
	private static void welcomeMessage() {
		System.out.println("ㅎㅇ 반갑고 ㅎㅇ");
		
	}

	private static void sayGoobye() {
		System.out.println("감사합니당");
		
	}
}
