package day10_20211018;


import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Member mem1 = new Member("kbj123", "0258", "kbj", "1@d");

		mem1.MemberJoin("kbj123", "0258", "kbj", "1@D");

		Scanner scan = new Scanner(System.in);
		
		System.out.print("id 입력: ");
		String id2=scan.nextLine();
		System.out.print("pw 입력: ");
		String pw2=scan.nextLine();
		
		if (mem1.login(id2,pw2)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		mem1.myInfo();
		
		mem1.memberUpdate("147kbj@naver.com");
		System.out.println(mem1.email);
		
		System.out.println(mem1);
		
		//로그인 정보 전달을 위한 Member 객체 생성
		
		
	}
}